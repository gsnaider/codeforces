package gs.codeforces.problems.problem4c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem4CSolver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		List<String> names = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			names.add(scanner.nextLine());
		}
		
		Set<String> database = new HashSet<>();
		Map<String, Integer> nextNumbers = new HashMap<>();
		
		scanner.close();
		for (String name : names) {
			if (database.add(name)) {
				System.out.println("OK");
			} else {
				int nextNumber;
				if (nextNumbers.containsKey(name)) {
					nextNumber = nextNumbers.get(name) + 1;
				} else {
					nextNumber = 1;
				}
				nextNumbers.put(name, nextNumber);
				String newName = name + nextNumber;
				database.add(newName);
				System.out.println(newName);
			}
		}
		
		
	}
	
}
