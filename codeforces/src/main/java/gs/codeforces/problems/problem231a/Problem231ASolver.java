package gs.codeforces.problems.problem231a;

import java.util.Scanner;

public class Problem231ASolver {

	private static final int FRIENDS = 3;
	private static final int MIN_FRIENDS_TO_IMPLEMENT_PROBLEM = 2;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int problemsImplemented = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < FRIENDS; j++) {
				sum += scanner.nextInt();
			}
			if (sum >= MIN_FRIENDS_TO_IMPLEMENT_PROBLEM) {
				problemsImplemented++;
			}
		}
		scanner.close();
		System.out.println(problemsImplemented);
	}
	
}
