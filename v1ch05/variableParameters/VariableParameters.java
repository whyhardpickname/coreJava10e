package variableParameters;

public class VariableParameters
{
	public static void main(String[] args)
	{
		System.out.println(max(-1, 4.2, 4));
	}
	
	public static double max(double... values)
	{
		double largest = Double.NEGATIVE_INFINITY;
		
		for (double v: values)
		{
			if (v > largest)
			{
				largest = v;
			}
		}
		return largest;
	}
}