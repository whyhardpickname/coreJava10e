import java.util.Random;

public class ConstructorTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("mark", 3800);
		staff[1] = new Employee(3800);
		staff[2] = new Employee();
		
		for (Employee e: staff)
		{
			System.out.println("name=" + e.getName()
				+ ", salary=" + e.getSalary()
				+ ", id=" + e.getId());
		}
	}
}

class Employee
{
	private static int nextId;
	
	private String name = ""; //field initialization
	private double salary;
	private int id;
	
	//static initialization block
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}	
	
	//objecct initialization block
	{
		id = nextId;
		nextId++;
	}
	
	//three overloaded constructor
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double salary)
	{
		this("Employee #" + nextId, salary);
	}
	
	public Employee()
	{
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
}