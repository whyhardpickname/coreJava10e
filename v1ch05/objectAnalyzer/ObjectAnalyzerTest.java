package objectAnalyzer;

import java.util.ArrayList;

public class ObjectAnalyzerTest
{
	public static void main(String[] args)
	{
		ArrayList<Integer> square = new ArrayList<Integer>();
		
		for (int i = 1; i < 5; i++)
		{
			square.add(i * i);
		}
		
		System.out.println(new ObjectAnalyzer().toString(square));
	}
}