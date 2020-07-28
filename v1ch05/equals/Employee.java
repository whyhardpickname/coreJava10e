package equals;

import java.util.LocalDate;

public class Employee
{
	private String name;
	private double salary;
	private LocalDate hiredate;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		hiredate = LocalDate.now();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHiredate()
	{
		return hiredate;
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject)
			return true;
		
		if (getClass() != otherObject.getClass())
			return false;
		
		if (otherObject == null)
			return false;
		
		Employee other = (Employee) otherObject;
		
		return Object.equals(name, other.name)
			&& Object.equals(salary, other.salary)
			&& Object.equals(hiredate, other.hiredate);
	}
	
	public int hashcode()
	{
		//toTdo
	}
	
	public String toString()
	{
		//toTdo
	}
}