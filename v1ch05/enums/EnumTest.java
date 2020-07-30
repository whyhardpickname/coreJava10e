package enums;

import java.util.*;

public class EnumTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("enter the size{SMALL, MEDIUM, LARGE, EXTRA_lARGE}: ");
		
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		
		System.out.println("size: " + size);
		System.out.println("abbreviation: " + size.getAbbreviation());
	}
}

enum Size
{
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_lARGE("XL");

	private Size(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation()
	{
		return abbreviation;
	}
	
	private String abbreviation;
}