package abstractClasses;

public class PersonTest
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		people[0] = new Employee("mark", 3800, 2020, 1, 1);
		people[1] = new Student("chern", "chemistry");
		
		for (Person p: people)
			System.out.println(p.getDescription());
	}
}