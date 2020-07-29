package equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee
{
	private String name;
	private double salary;
	private LocalDate hiredate;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		hiredate = LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDate()
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
		
		return Objects.equals(name, other.name)
			&& salary == other.salary
			&& Objects.equals(hiredate, other.hiredate);
	}
	
	public int hashCode()
	{
		return Objects.hash(name, salary, hiredate);
	}
	
	public String toString()
	{
		return getClass().getName() 
			+ "[name=" + name
			+ ", salary=" + salary
			+ ", hiredate=" + hiredate
			+ "]";
	}
}