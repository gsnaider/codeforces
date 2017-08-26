package gs.codeforces.problems.problem71a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem71ASolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wordCount = scanner.nextInt();
		scanner.nextLine();
		List<String> words = new ArrayList<>();
		for (int i = 0; i < wordCount; i++) {
			words.add(scanner.nextLine());
		}
		scanner.close();
		
		for (String word : words) {
			if (word.length() > 10) {
				word = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1); 
			}
			System.out.println(word);
		}
		
	
	}
	
}
