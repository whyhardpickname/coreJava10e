package arrays;

import java.lang.reflect.*;
import java.util.*;

public class CopyOfTest
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3};
		a = (int[]) GoodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));
		
		String[] b = {"markc", "carl", "bill"};
		System.out.println(Arrays.toString(b));
		b = (String[]) GoodCopyOf(b, 10);
		
		System.out.println("The following call will generate an exception");
		b = (String[]) BadCopyOf(b, 3);
	}
	
	public static Object GoodCopyOf(Object array, int newLength)
	{
		Class cl = array.getClass();
		
		if (!cl.isArray())
		{
			return null;
		}
		
		Class componentType = cl.getComponentType();
		int length = Array.getLength(array);
		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(array, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
	
	public static Object BadCopyOf(Object array, int newLength)
	{
		Object[] newArray = new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, newLength);
		return newArray;
	}
}