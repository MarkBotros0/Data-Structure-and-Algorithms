package problem_solving.week3;

import java.util.Scanner;

public class H_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String word = sc.next();
        word = word.trim();

        if (n < 26 || word.length() < 26) {
            System.out.println("NO");
            return;
        }

        word = word.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char c : alphabet.toCharArray()) {
            if (word.indexOf(c) < 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.print("YES");
    }
}
