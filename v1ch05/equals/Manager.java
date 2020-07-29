package equals;

import java.util.Objects;

public class Manager extends Employee
{
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public boolean equals(Object otherObject)
	{
		if (!super.equals(otherObject))
			return false;
		
		Manager other = (Manager) otherObject;
		
		return bonus == other.bonus;
	}
	
	public int hashCode()
	{
		return Objects.hash(getName(), getSalary(), getHireDate(), bonus);
	}
	
	public String toString()
	{
		return super.toString()
			+ "[bonus=" + bonus
			+ "]";
	}
}