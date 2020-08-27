package synch;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

public class SynchBankTest
{
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static final double MAX_AMOUNT = 1000;
	public static final int DELAY = 10;
	
	public static void main(String[] args)
	{
		Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++)
		{
			int fromAccount = i;
			Runnable r = () -> 
			{
				try
				{
					while(true)
					{
						int toAccount = (int) (bank.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						bank.transfer(fromAccount, toAccount, amount);
						Thread.sleep((int) (DELAY * Math.random()));
					}
				}
				catch (InterruptedException e)
				{
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
	}
	
}

class Bank
{
	
	private final double[] accounts;
	private Lock bankLock = new ReentrantLock();
	private Condition sufficientsFunds;
	
	public Bank(int n, double initialBalance)
	{
		sufficientsFunds = bankLock.newCondition();
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);
	}
	
	public void transfer(int from, int to, double amount) throws InterruptedException
	{
		bankLock.lock();
		try
		{
			while (accounts[from] < amount)
			{
				sufficientsFunds.await();
			}
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf("%10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf("Total balance: %10.2f%n", getTotalBalance());
			sufficientsFunds.signalAll();
		}
		finally
		{
			bankLock.unlock();
		}
	}
	
	public double getTotalBalance()
	{
		bankLock.lock();
		try
		{
			double total = 0;
			for (int i = 0; i < accounts.length; i++)
			{
				total += accounts[i];
			}
			return total;
		}
		finally
		{
			bankLock.unlock();
		}
	}
	
	public int size()
	{
		return accounts.length;
	}
}