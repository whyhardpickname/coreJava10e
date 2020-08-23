package sieve;

import java.util.*;

public class Sieve
{
	public static void main(String[] args)
	{
		int n = 2000000;
		BitSet primes = new BitSet(n + 1);
		for (int i = 2; i <= n; i++)
		{
			primes.set(i);
		}
		
		int i = 2;
		int counter = 0;
		int k = 2;
		while (i * i <= n)
		{
			if (primes.get(i))
			{
				k = 2 * i;
				while (k <= n)
				{
					primes.clear(k);
					k += i;
				}
			}
			i++;
		}
		for (int j = 0; j <= n; j++)
		{
			if (primes.get(j))
			{
				counter++;
			}
		}
		System.out.println(counter);
	}
}