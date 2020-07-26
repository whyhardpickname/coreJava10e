package inheritance;

public class ManagerTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		Manager boss = new Manager("markchern", 10000, 2020, 1, 1);
		boss.setBonus(5000);
		
		staff[0] = boss;
		staff[1] = new Employee("staff1", 5000, 2020, 1, 1);
		staff[2] = new Employee("staff2", 5000, 2020, 1, 1);
		
		for (Employee e: staff)
			System.out.println("name=" + e.getName()
				+ ", salary=" + e.getSalary()
				+ "]");
	}
}