import java.util.Calendar;

public class CountingDaysUntil {
	
	public static void main(String[] args){
		int inputYear = Integer.parseInt(args[2]);
		int inputMonth = Integer.parseInt(args[1]);
		int inputDay = Integer.parseInt(args[0]);
		int yearLength = 365;
		int dayCount = 0;
		Calendar cal = Calendar.getInstance();
		int currentDay = cal.get(Calendar.DATE);
		int currentMonth = cal.get(Calendar.MONTH);
		int currentYear = cal.get(Calendar.YEAR);
		int[] arrayofYears = new int[]{2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030,2031,2032,2033,2034,2035,2036,2037,2038,2039,2040};
		int[] daysinMonths = new int[]{31,28,30,31,30,31,31,30,31,30,31};
		int[] listofLeaps = new int[]{2016,2020,2024,2028,2032,2036,2040};
		
		int currentdayspast = 0;
		for (int i=0; i<currentMonth; i++) {
			currentdayspast = currentdayspast + daysinMonths[i];
		}
		currentdayspast = 365 - (currentdayspast + currentDay);
		
		int numberofYears = inputYear-currentYear-1;
		dayCount = currentdayspast + (numberofYears*yearLength);
		
		System.out.println("The Date you chose is: " + inputDay + "/" + inputMonth + "/" + inputYear);
		System.out.println("The Number of days until then is: " + dayCount);
		
	}

}
