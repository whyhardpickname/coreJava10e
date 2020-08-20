package treeSet;

import java.util.*;

public class Item implements Comparable<Item>
{
	private int number;
	private String description;
	
	Item(String description, int number)
	{
		this.description = description;
		this.number = number;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String toString()
	{
		return "[" + "description=" + description +
			", number=" + number + "]";
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject)
		{
			return true;
		}
		if (otherObject == null)
		{
			return false;
		}
		
		if (getClass() != otherObject.getClass())
		{
			return false;
		}
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) &&
			number == other.number;
	}
	
	public int hashCode()
	{
		return Objects.hash(description, number);
	}
	
	public int compareTo(Item other)
	{
		int diff = Integer.compare(number, other.number);
		return diff != 0 ? diff : 
			description.compareTo(other.description);
	}
}