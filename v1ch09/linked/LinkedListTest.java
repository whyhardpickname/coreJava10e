package linked;

import java.util.*;

public class LinkedListTest
{
	public static void main(String[] args)
	{
		List<String> linked1 = new LinkedList<String>();
		linked1.add("A");
		linked1.add("C");
		linked1.add("E");
		
		List<String> linked2 = new LinkedList<String>();
		linked2.add("B");
		linked2.add("D");
		linked2.add("F");	
		linked2.add("G");
		
			
		ListIterator<String> iter1 = linked1.listIterator();
		ListIterator<String> iter2 = linked2.listIterator();
		
		while (iter2.hasNext())
		{
			if (iter1.hasNext())
			{
				if (iter2.next().compareTo(iter1.next()) > 0)
				{
					iter1.next();
				}
				else
				{
					iter1.previous();
					iter1.add(iter2.previous());
					iter1.next();
					iter2.next();
				}
			}
			else
			{
				iter1.add(iter2.next());
			}
		}
		
		iter2 = linked2.listIterator();
		while (iter2.hasNext())
		{
			iter2.next();
			iter2.next();
			iter2.remove();
		}
		
		System.out.println("linked1 = " + linked1);
		System.out.println("linked2 = " + linked2);
	}
}