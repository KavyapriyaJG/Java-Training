import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Lorry's Distance to be traveled, Speed of lorry, Start date and time of the journey are fetched from user and Calculation initiated
 * @author Kavyapriya
 */
public class Lorry {
	/**
	 * Get inputs like Distance to be traveled, Speed of lorry, Start date and time of the journey
	 * @param args not used
	 */
	public static void main(String[] args) {
		int distance, speed;
		LocalDate date;
		LocalTime time;
		
		try (Scanner sc = new Scanner(System.in);) {
			//Distance to be traveled
			while(true) {
				System.out.print("\nEnter the distance to be covered in kms : ");
				try {
					distance = Integer.parseInt(sc.next());
					if(distance==0) {
						System.out.print("Destination can't be as same as the arrival spot !.. ");
					}else if(distance<0) {
						System.out.print("Distance can't be negative !... ");
					}else {
						break;
					}
					System.out.println("Please enter a valid distance!..");
				}catch(NumberFormatException e) {
					System.out.println("Please enter the appropriate distance in numbers!..");
				}
			}

			//Speed of the lorry
			while(true) {
				System.out.print("\nEnter the speed of lorry in kmph : ");
				try {
					speed = Integer.parseInt(sc.next());
					if(speed==0) {
						System.out.print("Speed must have some value!.. ");
					}else if(speed<0) {
						System.out.print("Speed can't be negative!.. ");
					}else {
						break;
					}
				System.out.println("Please enter a valid speed!..");
				}catch(NumberFormatException e) {
					System.out.println("Please enter the appropriate speed in numbers!..");
				}
			}

			//Start date of the journey
			while(true) {
				System.out.print("\nEnter the travel start date in yyyy-mm-dd : ");
				try {
					date = LocalDate.parse(sc.next());
					break;
				}catch(Exception e) {
					System.out.println("Please Enter the appropriate date in yyyy-mm-dd format !...");
				}
			}
			
			//End date of the journey
			while(true) {
				System.out.print("\nEnter the travel start time in hh:mm (24hours format) : ");
				try {
					time = LocalTime.parse(sc.next());
					break;
				}catch(Exception e) {
					System.out.println("Please Enter the appropriate time in hh:mm format !...");	
				}
			}

			LocalDateTime dateTime = LocalDateTime.parse(date + "T" + time);
			Calculation destination = new Calculation(dateTime);
			destination.calculateArrivalTime(distance, speed);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
