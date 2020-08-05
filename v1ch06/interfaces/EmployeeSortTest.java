package interfaces;

import java.util.Arrays;

public class EmployeeSortTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("bob", 3800, 2020, 1, 1);
		staff[1] = new Employee("carl", 10000, 2020, 1, 1);
		staff[2] = new Employee("alice", 7000, 2020, 1, 1);
		
		Arrays.sort(staff);
		
		for (int i = 0; i < staff.length; i++)
		{
			System.out.println("staff" + i + "=" + staff[i].getSalary());
		}
	}
}