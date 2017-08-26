package gs.codeforces.problems.problem4a;

import java.util.Scanner;

public class Problem4ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		String answer = (w > 2 && w % 2 == 0) ? "YES" : "NO";
		System.out.println(answer);
	}
	
}
