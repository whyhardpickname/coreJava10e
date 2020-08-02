package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;



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
				Object value = Array.get(object, i);
				if (i > 0)
				{
					result += ", ";
				}
				if (cl.getComponentType().isPrimitive())
				{
					result += value;
				}
				
				else
				{
					result += toString(value);
				}
			}
			return result + "}";
		}
		
		String result = cl.getName();
		
		do
		{
			result += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			
			for (Field f: fields)
			{
				if (!Modifier.isStatic(f.getModifiers()))
				{
					if (!result.endsWith("["))
					{
						result += ", ";
					}
					result += f.getName() + "=";
					try
					{
						Class fieldtype = f.getType();
						Object value = f.get(object);
						
						if (fieldtype.isPrimitive())
						{
							result += value;
						}
					
						else
						{
							result += toString(value);
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			
			result += "]";
			cl = cl.getSuperclass();
		}
		while(cl != null);
		
		return result;
	}
}