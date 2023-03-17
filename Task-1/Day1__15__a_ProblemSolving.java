import java.util.Scanner;

public class Day1__15__a_ProblemSolving {
	public static void printPrimeNumbers(int start, int end) {
		boolean prime[] = new boolean[end + 1-start];

		prime[0]=false;

		for (int i = start; i <= end; i++)
			prime[i] = true;

		for (int p = 2; p * p <= end; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= end; i += p)
					prime[i] = false;
			}
		}

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

		printPrimeNumbers(start, end);

	}
}
