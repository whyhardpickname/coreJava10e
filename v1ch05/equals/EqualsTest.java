package equals;

public class EqualsTest
{
	public static void main(String[] args)
	{
		Employee alice1 = new Employee("alice", 3800, 2020, 1, 1);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("alice", 3800, 2020, 1, 1);
		Employee bob = new Manager("bob", 3800, 2019, 1, 1);
		
		System.out.println("alice1 == alice2: " + (alice1 == alice2));
		
		System.out.println("alice1 == alice3: " + (alice1 == alice3));
		
		System.out.println("alice1.equals(alice3): " + alice1.equals(alice2));
		
		System.out.println("alice1.equals(bob):" + alice1.equals(bob));
		
		
		Manager carl = new Manager("carl", 10000, 2018, 1, 1);
		Manager boss = new Manager("carl", 10000, 2018, 1, 1);
		boss.setBonus(10000);
		
		System.out.println("boss.toString(): " + boss.toString());
		
		System.out.println("carl.equals(boss): " + carl.equals(boss));
		
		System.out.println("alice1.hashCode(): " + alice1.hashCode());
		
		System.out.println("alice3.hashCode(): " + alice3.hashCode());
		
		System.out.println("bob.hashCode(): " + bob.hashCode());
		
		System.out.println("boss.hashCode(): " + boss.hashCode());
		
		
		
		
	}
}