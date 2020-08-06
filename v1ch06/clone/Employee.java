package clone;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>, Cloneable
{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public int getId()
	{
		return id;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;	
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee("mark", 38000, 2020, 1, 1);
		
		System.out.println("Employee[name=" + e.getName()
			+ ", salary=" + e.getSalary() + "]");
	}
	
	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		
		Employee cloned = (Employee) super.clone();
		
		return cloned;
	}
}