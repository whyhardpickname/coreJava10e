package arrayList;

import java.util.*;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("mark", 3800,2020, 1, 1));
		staff.add(new Employee("carl", 10000, 2020, 1,1));
		
		for (Employee e: staff)
		{
			System.out.println("name = " + e.getName()
				+ ", salary = " + e.getSalary()
				+ ", hireDate = " + e.getHireDay());
		}
	}
}