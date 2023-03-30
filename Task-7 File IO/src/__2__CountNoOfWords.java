import java.util.Scanner;

public class __2__CountNoOfWords {
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in); ){
			String inputString = scanner.nextLine();
			
			String[] inputStringWords = inputString.split(" ");
			System.out.println("No of words recieved via System input : "+inputStringWords.length);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}