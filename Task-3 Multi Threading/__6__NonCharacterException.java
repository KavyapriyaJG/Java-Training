import java.util.Scanner;

class NonCharacterException extends Exception {
	NonCharacterException() {
		super("Not A Character :( ");
	}

}

class Handler {
	public void handle() {
		System.out.println("No problem.. continue.. ");
	}
}

class CharacterThread extends Thread {

	public void run(char input) {
		try {
			if (!Character.isAlphabetic(input)) {
				throw new NonCharacterException();
			} else {
				System.out.println(input);
			}
		} catch (NonCharacterException nce) {
			nce.printStackTrace();
			new Handler().handle();
		}
	}
}

public class __6__NonCharacterException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		CharacterThread characterThread = new CharacterThread();
		
		int length = input.length();
		for (int index = 0; index < length; index++) {
			characterThread.run(input.charAt(index));
		}
		
		scanner.close();
	}

}
