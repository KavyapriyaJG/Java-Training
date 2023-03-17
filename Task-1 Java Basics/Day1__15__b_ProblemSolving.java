import java.util.Scanner;

public class Day1__15__b_ProblemSolving {

	public static boolean isArmstrongNumber(int number) {
		int armstrong = 0, element = number, noOfDigits = 0;

		while (element > 0) {
			noOfDigits++;
			element /= 10;
		}

		element = number;
		while (element > 0) {
			armstrong += (int) Math.pow((element % 10), noOfDigits);
			element /= 10;
		}
		return (armstrong == number);
	}

	public static boolean isPalindromeNumber(int number) {
		int palindrome = 0, element = number;
		while (element > 0) {
			palindrome = (palindrome * 10) + (element % 10);
			element /= 10;
		}
		return (palindrome == number);
	}

	public static boolean isPerfectNumber(int number) {
		int perfect = 1, i;
		for (i = 2; i <= number / 2; i++)
			if (number % i == 0)
				perfect += i;
		return (perfect == number);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();

		boolean isArmstrong = isArmstrongNumber(number);
		boolean isPalindrome = isPalindromeNumber(number);
		boolean isPerfect = isPerfectNumber(number);

		System.out.print("The given number is a ");

		if (isArmstrong || isPalindrome || isPerfect) {
			if (isArmstrong)
				System.out.println("Armstrong number");
			if (isPalindrome)
				System.out.println("Palindrome number");
			if (isPerfect)
				System.out.println("Perfect number");
		} else
			System.out.println("Normal number");
	}

}
