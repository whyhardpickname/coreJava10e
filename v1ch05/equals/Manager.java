package equals;

public class Manager extends Employee
{
	private bonus;
	
	public Manager(String name, double salary)
	{
		super(name, salary);
		bonus = 0;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public boolean equals()
	{
		//toTdo
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