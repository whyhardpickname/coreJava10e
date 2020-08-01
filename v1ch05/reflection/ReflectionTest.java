package reflection;

import java.lang.reflect.*;
import java.util.*;

public class ReflectionTest
{
	public static void main(String[] args)
	{
		String className;
		
		if (args.length == 1)
		{
			className = args[0];
		}
		else
		{
			System.out.print("enter a class name(e.g. java.lang.Double): ");
			Scanner in = new Scanner(System.in);
			className = in.next();
		}
		
		try
		{
			Class cl = Class.forName(className);
			Class superClass = cl.getSuperclass();
			
			System.out.print(Modifier.toString(cl.getModifiers()) + " " + cl.getClass().getName());
			
			if (superClass != null && superClass != cl.getClass())
			{
				System.out.println(" extends " + superClass.getName());
			}
			
			System.out.println("{");
			
			printFields(cl);
			System.out.print("\n");
			
			printConstructors(cl);
			System.out.print("\n");
			
			printMethods(cl);
			
			System.out.println("}");	
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.exit(0);
	}
		
	public static void printFields(Class cl)
	{
		Field[] fields = cl.getDeclaredFields();
		
		for (Field f: fields)
		{
			System.out.println("	" + Modifier.toString(f.getModifiers()) + " " +  f.getName());
		}
	}
	
	public static void printConstructors(Class cl)
	{
		Constructor[] constructors = cl.getDeclaredConstructors();
		Class[] parameters;
		
		for (Constructor c: constructors)
		{
			parameters = c.getParameterTypes();
			
			System.out.print("	" + Modifier.toString(c.getModifiers()) + " " +  c.getName() + "(");
			
			if (parameters.length == 0)
			{
				System.out.print(")");
			}
			
			for (int i = 0; i < parameters.length; i++)
			{
				System.out.print(parameters[i].getName());
				if (i != parameters.length - 1)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(")");
				}
			}
			
			System.out.print("\n");
		}
	}
	
	public static void printMethods(Class cl)
	{
		Method[] methods = cl.getDeclaredMethods();
		Class returnType;
		Class[] parameters;
		
		for (Method m: methods)
		{
			returnType = m.getReturnType();
			parameters = m.getParameterTypes();
			
			System.out.print("	" + Modifier.toString(m.getModifiers()) + " " + returnType.getName() + " " +  m.getName() + "(");
			
			if (parameters.length == 0)
			{
				System.out.print(")");
			}
			
			for (int i = 0; i < parameters.length; i++)
			{
				System.out.print(parameters[i].getName());
				if (i != parameters.length - 1)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(")");
				}
			}
			
			System.out.print("\n");
		}
	}
}