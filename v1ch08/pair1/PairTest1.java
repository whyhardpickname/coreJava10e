package pair1;

public class PairTest1
{
	public static void main(String[] args)
	{
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mm = MinMax.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getsecond());
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
	
	public T getsecond()
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

class MinMax
{
	public static Pair<String> minmax(String[] a)
	{
		if (a.length == 0 || a == null)
		{
			return null;
		}
		
		String min = a[0];
		String max = a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			if (min.compareTo(a[i]) > 0 )
			{
				min = a[i];
			}
			
			if (max.compareTo(a[i]) < 0)
			{
				max = a[i];
			}
		}
		return new Pair<String>(min, max);
	}
}