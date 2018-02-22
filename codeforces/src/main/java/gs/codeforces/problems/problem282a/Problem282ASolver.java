package gs.codeforces.problems.problem282a;

import java.util.Scanner;

public class Problem282ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int x = 0;
		for (int i = 0; i < n; i++) {
			if(scanner.nextLine().contains("+")) {
				x++;
			} else {
				x--;
			}
		}
		scanner.close();
		System.out.println(x);
	}
	
}
