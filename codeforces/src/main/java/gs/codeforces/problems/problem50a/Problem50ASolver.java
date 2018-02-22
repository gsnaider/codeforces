package gs.codeforces.problems.problem50a;

import java.util.Scanner;

public class Problem50ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		System.out.println(maxDominos(m, n));
	}

	private static int maxDominos(int m, int n) {
		int maxDominos = 0;

		// If either m or n are odd, remove the odd row and treat it separately.
		if (m % 2 != 0) {
			m = m - 1;
			maxDominos += n / 2;
		}
		if (n % 2 != 0) {
			n = n - 1;
			maxDominos += m / 2;
		}

		maxDominos += m * n / 2;

		return maxDominos;
	}

}
