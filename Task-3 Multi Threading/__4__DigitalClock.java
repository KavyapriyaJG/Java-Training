public class __4__DigitalClock {

	static void startTheClock(){
		int hours =0, minutes =0, seconds =0;
		
		try {

			while(true) { 
		        System.out.printf("%02d : %02d : %02d \n", hours, minutes, seconds);
		        
				if(seconds<60) {
					seconds++;
				}
				else {
					if(minutes<60) {
						seconds = 0;
						minutes++;
					}
					else {
						if(hours<24) {
							minutes = 0;
							hours++;
						}
						else {
							System.out.println("One day over!");
						}
					}
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("Interrupted !" + e);
		}
		
	}
	
	public static void main(String[] args){
		startTheClock();
	}

}
