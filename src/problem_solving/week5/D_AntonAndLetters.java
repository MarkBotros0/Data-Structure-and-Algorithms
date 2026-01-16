package problem_solving.week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        Set<Character> charSet = new HashSet<>();
        for (char c : line.toCharArray()) {
            if (c != ' ' && c != ',' && c != '{' && c != '}') charSet.add(c);
        }
        System.out.println(charSet.size());
    }
}
