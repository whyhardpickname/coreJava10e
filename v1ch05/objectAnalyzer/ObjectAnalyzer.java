package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;



public class ObjectAnalyzer
{
	private ArrayList<Object> visited = new ArrayList<Object>();
	
	public String toString(Object object)
	{
		if (object == null)
		{
			return "null";
		}
		
		if (visited.contains(object))
		{
			return "...";
		}
		
		visited.add(object);
		
		Class cl = object.getClass();
		
		if (cl == String.class)
		{
			return (String) object;
		}
		
		if (cl.isArray())
		{
			String result = cl.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(object); i++)
			{
				result += 
			}
		}
		
		Field[] fields = cl.getField();
		AccessibleObject.setAccessible(fields, true);
		
		
	}
}