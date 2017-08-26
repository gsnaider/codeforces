package gs.codeforces.problems.problem118a;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem118ASolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        StringBuilder builder = new StringBuilder();
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            if (!vowels.contains(c)) {
                builder.append('.');
                builder.append(c);
            }
        }
        System.out.println(builder.toString());
    }

}
