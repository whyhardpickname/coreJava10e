import java.time.LocalDate;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("001", 3000, 2020, 1, 1);
		staff[1] = new Employee("002", 6000, 2020, 1, 2);
		staff[2] = new Employee("003", 12000, 2020, 1, 3);
		
		for (Employee e:staff)
		{
			e.raiseSalary(5);
		}
		
		for (Employee e:staff)
		{
			e.setId();
			System.out.println("Employee[name=" + e.getName()
				+ ", salary=" + e.getSalary()
				+ ", hireDay=" + e.getHireDay().toString());
		}
		
		System.out.println("nextId=" + Employee.getNextId());
	}
}

class Employee
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
		Employee e = new Employee("mark", 1000, 2020, 1, 1);
		
		System.out.println("Employee[name=" + e.getName()
			+ ", salary=" + e.getSalary());
	}
}