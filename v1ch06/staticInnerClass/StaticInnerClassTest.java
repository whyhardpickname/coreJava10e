package staticInnerClass;

public class StaticInnerClassTest
{
	public static void main(String[] args)
	{
		double[] d = new double[20];
		for (int i = 0; i < d.length; i++)
		{
			d[i] = 100 * Math.random();
		}
		
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println("min=" + p.getMin());
		System.out.println("max=" + p.getMax());
	}
}

class ArrayAlg	
{
	public static class Pair
	{
		private double first;
		private double second;
		
		public Pair(double first, double second)
		{
			this.first = first;
			this.second = second;
		}
		
		public double getMin()
		{
			return first;
		}
		
		public double getMax()
		{
			return second;
		}
	}
		
	public static Pair minmax(double[] values)
	{
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		
		for (int i = 0; i < values.length; i++)
		{
			if (values[i] < min)
			{
				min = values[i];
			}
			
			if (values[i] > max)
			{
				max = values[i];
			}
		}
		return new Pair(min, max);
	}
	
}