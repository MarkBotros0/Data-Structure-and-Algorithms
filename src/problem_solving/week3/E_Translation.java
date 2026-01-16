package problem_solving.week3;

import java.util.Scanner;

public class E_Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String translation = sc.next();

        String wordReversed = new StringBuilder(word).reverse().toString();

        System.out.print(translation.equals(wordReversed) ? "YES" : "NO");
    }
}
