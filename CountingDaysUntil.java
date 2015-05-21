import java.util.Calendar;

/*
 * "Counting days Until" 
 * A program that counts the number of days between the current day and a day in the future.
 * http://www.reddit.com/r/dailyprogrammer/comments/2vc5xq/20150209_challenge_201_easy_counting_the_days/
 * 
 * (Going to come back to this in the future with a better option as a friend told me about the Date Type)
 * 
 * Initial Commit - 11 Days out (leap years not included)
 * 
 */
public class CountingDaysUntil {
	/*
	 * Takes a date input from the input arguments and calculates the number of days
	 *	between the current date and time.
	 */
	
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
		//int[] arrayofYears = new int[]{2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030,2031,2032,2033,2034,2035,2036,2037,2038,2039,2040};
		int[] daysinMonths = new int[]{31,28,30,31,30,31,31,30,31,30,31}; //Shows the number of days in each month from 1-12.
		//int[] listofLeaps = new int[]{2016,2020,2024,2028,2032,2036,2040};
		
		int currentdayspast = 0; //Count of all days up to the current date in the year.
		for (int i=0; i<currentMonth; i++) {
			currentdayspast = currentdayspast + daysinMonths[i];
		}
		currentdayspast = 365 - (currentdayspast + currentDay); //How many days until the end of this year
		
		int numberofYears = inputYear-currentYear-1;
		dayCount = currentdayspast + (numberofYears*yearLength); //Days in the year from the end of this year to the start of the year in question.
		
		System.out.println("The Date you chose is: " + inputDay + "/" + inputMonth + "/" + inputYear);
		System.out.println("The Number of days until then is: " + dayCount);
		
	}

}
