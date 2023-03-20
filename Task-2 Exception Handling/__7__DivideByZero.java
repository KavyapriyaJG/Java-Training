import java.util.InputMismatchException;
import java.util.Scanner;

class ChoseToQuitException extends PriyaDefinedException {
	ChoseToQuitException() {
		super("Thank you. Bye");
	}
}

public class __7__DivideByZero {

	static void terminateOnChoice(Character c) throws ChoseToQuitException {
		if (c == 'Q' || c == 'q')
			throw new ChoseToQuitException();
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		String numeratorString;
		int numerator = 1, denominator = 1, ans;
		boolean isInvalidNumerator = true, isInvalidDenominator = true;

		while (true) {
			isInvalidNumerator = true;
			isInvalidDenominator = true;
			while (isInvalidNumerator) {
				try {
					System.out.println("Enter the numerator : ");
					numeratorString = scanner.next();
					if (numeratorString.length() == 1
							&& (numeratorString.charAt(0) == 'q' || numeratorString.charAt(0) == 'Q'))
						throw new ChoseToQuitException();

					numerator = Integer.parseInt(numeratorString);
					isInvalidNumerator = false;

				} catch (ChoseToQuitException quit) {
					System.exit(0);
				} catch (NumberFormatException nfe) {
					System.out.println("Re enter a valid numerator!");
				}
			}
			while (isInvalidDenominator) {
				try {
					System.out.println("Enter the denominator : ");
					denominator = Integer.parseInt(scanner.next());
					ans = numerator / denominator;
					System.out.println("Answer is : " + ans);
					isInvalidDenominator = false;
				} catch (NumberFormatException nfe) {
					System.out.println("Re enter a valid denominator!");
				} catch (ArithmeticException ae) {
					System.out.println("Poor division "+ ae);
				}
			}
		}

	}

}
