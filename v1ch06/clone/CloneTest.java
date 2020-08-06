package clone;

public class CloneTest
{
	public static void main(String[] args)
	{
		try
		{
			Employee e1 = new Employee("mark", 3800, 2020, 1, 1);
			Employee e2 = e1.clone();
		
			e1.raiseSalary(100);
		
			System.out.println("name=" + e1.getName() + "salary=" + e1.getSalary());
			System.out.println("name=" + e2.getName() + "salary=" + e2.getSalary());
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
	}
}