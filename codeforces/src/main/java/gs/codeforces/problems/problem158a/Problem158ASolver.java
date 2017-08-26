package gs.codeforces.problems.problem158a;

import java.util.Scanner;

public class Problem158ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = scanner.nextInt();
		}
		scanner.close();
		
		int classified;
		if (scores[k - 1] > 0) {
			classified = k;
			int i = k;
			while (i < scores.length && scores[i] == scores[k - 1]) {
				classified++;
				i++;
			}
		} else {
			int i = k - 2;
			while (i >= 0 && scores[i] == 0) {
				i--;
			}
			classified = i + 1;
		}
		System.out.println(classified);
		
	}
	
}
