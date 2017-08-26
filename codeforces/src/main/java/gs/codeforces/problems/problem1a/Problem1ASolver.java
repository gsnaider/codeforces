package gs.codeforces.problems.problem1a;

import java.util.Scanner;

public class Problem1ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		scanner.close();

		long answer = (long) (Math.ceil((double) m / a) * Math.ceil((double) n / a));
		System.out.println(answer);
	}
	
}
	