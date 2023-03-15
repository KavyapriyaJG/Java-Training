import java.util.Scanner;

public class ProblemSolving {
	// PRIME NUMBERS
	public static void getPrimeNumbers(int start, int end) {
		boolean prime[] = new boolean[end + 1];

		// To skip 1 which is neither a prime nor a composite number
		if (start == 1)
			start = start + 1;

		for (int i = start; i <= end; i++)
			prime[i] = true;

		for (int p = 2; p * p <= end; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= end; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = start; i <= end; i++)
			if (prime[i] == true)
				System.out.print(i + " ");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start, end;
		System.out.print("Enter start and end range : ");
		start = scanner.nextInt();
		end = scanner.nextInt();

		// PRIME NUMBERS
		getPrimeNumbers(start, end);

	}
}
