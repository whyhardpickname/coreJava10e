import java.time.*;
public class CalanderTest
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		int today = date.getDayOfMonth();
		int lengthOfMonth = date.lengthOfMonth();
		LocalDate day = date.minusDays(today - 1);
		int week = day.getDayOfWeek().getValue();
		
		System.out.println("MON TUE WED TUR FRI SAT SUN");
		for (int i = 1; i < today; i++)
		{
			System.out.print("    ");
		}
		
		for (int i = 0; i < lengthOfMonth; i++)
		{
			if (day.equals(today))
			{
				System.out.printf("%3i*", day.getDayOfMonth());
			}
			else
			{
				System.out.printf("%3i", day.getDayOfMonth());
			}
			
			day.plusDays(1);
			if (day.getDayOfWeek().getValue() == 7)
			{
				System.out.println();
			}
		}
	}
}