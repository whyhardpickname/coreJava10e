import java.time.LocalDate;
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
		for (int i = 0; i < day.getDayOfWeek().getValue() - 1; i++)
		{
			System.out.print("    ");
		}
		
		for (int i = 0; i < lengthOfMonth; i++)
		{
			if (day.getDayOfMonth() == today)
			{
				System.out.printf("%3d*", day.getDayOfMonth());
			}
			else
			{
				System.out.printf("%3d ", day.getDayOfMonth());
			}
			
			day = day.plusDays(1);
			if (day.getDayOfWeek().getValue() == 1)
			{
				System.out.println();
			}
		}
	}
}