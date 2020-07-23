/**
	This program demostrate parameter passing in java
	@version 1.00 2020-7-23
	@author MarkChern
*/

public class ParamTest
{
	public static void main(String[] args)
	{
		//test1 triple value
		double percent = 10.0;
		System.out.println("before: percent=" + percent);
		triple(percent);
		System.out.println("after: percent=" + percent);
		
		//test tripleSalary;
		Employee harry = new Employee("harry", 4000, 2020, 7, 23);
		System.out.println("before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("after: percent=" + harry.getSalary());
		
		//swap object
		Employee a = new Employee("Alice", 1000, 2020, 7, 23);
		Employee b = new Employee("Bob", 1000, 2020, 7, 23);
		
		System.out.println("before swap: a=" + a.getName()
			+ ", b=" + b.getName());
		swap(a, b);
		System.out.println("after swap: a=" + a.getName()
			+ ", b=" + b.getName());
	}
	
	public static double triple(double x)
	{
		return 3 * x;
	}
	
	public static void swap(Employee x, Employee y)
	{
		Employee temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("end method: x=" + x.getName()
			+ ", y=" + y.getName());
		
	}
	
	public static void tripleSalary(Employee e)
	{
		e.raiseSalary(200);
		System.out.println("end method: salary=" + e.getSalary());
	
	}
}