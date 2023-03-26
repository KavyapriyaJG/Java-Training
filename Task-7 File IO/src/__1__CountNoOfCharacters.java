import java.util.Scanner;

public class __1__CountNoOfCharacters {
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in); ){
			String inputString = scanner.nextLine();
			
			char[] inputStringCharacters = inputString.toCharArray();
			System.out.println("No of characters recieved via System input : "+inputStringCharacters.length);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
