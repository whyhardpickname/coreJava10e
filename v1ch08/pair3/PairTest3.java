package pair3;

public class PairTest3
{
	public static void main(String[] args)
	{
		Manager ceo = new Manager("ceo", 100000, 2020, 1, 1);
		Manager cfo = new Manager("cfo", 80000, 2020, 1, 1);
		Pair<Manager> buddies = new Pair<>(ceo, cfo);
		printBuddies(buddies);
		
		ceo.setBonus(100000);
		cfo.setBonus(50000);
		
		Manager[] managers = {ceo, cfo};
		
		Pair<Employee> result = new Pair<>();
		minmaxBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName()
			+ ", second: " + result.getSecond().getName());
		maxminBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName()
			+ ", second: " + result.getSecond().getName());
	}
		public static void printBuddies(Pair<? extends Employee> p)
		{
			Employee first = p.getFirst();
			Employee second = p.getSecond();
			System.out.println(first.getName() + second.getName() + "are buddies");
		}
		
	public static void minmaxBonus(Manager[] m, Pair<? super Manager> result)
	{
		if (m.length == 0)
		{
			return;
		}
		Manager min = m[0];
		Manager max = m[0];
		
		for (int i = 0; i < m.length; i++)
		{
			if (min.getBonus() > m[i].getBonus())
			{
				min = m[i];
			}
			if (max.getBonus() < m[i].getBonus())
			{
				max = m[i];
			}
		}
		result.setFirst(min);
		result.setSecond(max);
	}
	
	public static void maxminBonus(Manager[] m, Pair<? super Manager> result)
	{
		minmaxBonus(m, result);
		PairAlg.swapHelper(result);
	}
	
}

class Pair<T>
{
	private T first;
	private T second;
	
	public Pair()
	{
		this.first = null;
		this.second = null;
	}
	
	public Pair(T first, T second)
	{
		this.first = first;
		this.second = second;
	}
	
	public T getFirst()
	{
		return first;
	}
	
	public T getSecond()
	{
		return second;
	}
	
	public void setFirst(T first)
	{
		this.first = first;
	}
	
	public void setSecond(T second)
	{
		this.second = second;
	}
}

class PairAlg
{
	public static boolean hasNull(Pair<?> p)
	{
		return p.getFirst() == null || p.getSecond() == null;
	}
	
	public static void swap(Pair<?> p)
	{
		swapHelper(p);
	}
	
	public static <T> void swapHelper(Pair<T> p)
	{
		T t = p.getFirst();
		p.setFirst(p.getSecond());
		p.setSecond(t);
	}
	
	
}