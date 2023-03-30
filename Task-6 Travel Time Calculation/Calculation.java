import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Calculation of the arrival time of Lorry
 * @author Kavyapriya
 */
public class Calculation
{
	int totalTime=0, remainingTime=0, holidays=0, days=0, currentDayRemaining=0;
	
	LocalDateTime date;
	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	/**
	 * Constructor
	 * @param date Departure date
	 */
	public Calculation(LocalDateTime date)
	{
		this.date = date;
	}
	
	/**
	 * Check if a day is a holiday
	 * @param date The day to check
	 * @return true if it is a holiday || false if it is not a holiday
	 */
	boolean isHoliday(LocalDateTime date)
	{	
		DayOfWeek day = date.getDayOfWeek();
		int dayOfMonth = date.getDayOfMonth();
		int month = date.getMonthValue();
	
		return(day == DayOfWeek.SUNDAY 
				|| (day == DayOfWeek.SATURDAY && (dayOfMonth>7 && dayOfMonth<=15) )
				|| (month == 1 && dayOfMonth ==1) 
				|| (month == 1 && dayOfMonth ==26)
				|| (month == 8 && dayOfMonth ==15));
	}
	
	/**
	 * Calculate the arrival date and time
	 * @param distance Distance to be covered
	 * @param speed Speed of the Lorry
	 */
	void calculateArrivalTime(int distance,int speed){
		totalTime = distance/speed;
		remainingTime = totalTime % 8;
		
		currentDayRemaining = 23 - date.getHour();
		
		if(currentDayRemaining < 8)
		{
			System.out.println("\nStarting date and time is "+ date.plusDays(1).format(format));
		}
		else
		{
			System.out.println("\nStarting date and time is "+ date.format(format));
		}
		
		while((totalTime/8) > days)
		{
			date = date.plusDays(1);
			
			if(isHoliday(date))
			{
				holidays++;
			}
			days++;
		}
		
		date = date.plusDays(days - holidays).plusHours(remainingTime);
		
		System.out.println("Arrival date and time would be " + date.format(format));
	}
}



