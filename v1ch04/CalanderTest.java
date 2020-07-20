import java.time.*;
public CalanderTest
{
	public static void main(String[] args)
	{
		LocaleDate date = LocalDate.now();
		int today = date.getDayOfMonth();
		int lengthOfMonth = date.lengthOfMonth();
		Localeday day = today.minusDays(today - 1);
		int week = day.getValue();
		
		System.out.println("MON TUE WED TUR FRI SAT SUN")；
		for (int i = 1; i < today; i++)
		{
			System.out.print("    ");
		}
		
		for (int i = 0; i < lengthOfMonth; i++)
		{
			if (day )
			{
				System.out.printf("%3i")
			}
		}
	}
}