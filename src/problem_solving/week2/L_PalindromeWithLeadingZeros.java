package problem_solving.week2;

import java.util.Scanner;

public class L_PalindromeWithLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nString = sc.next();

        boolean isPalindrome = isPalindrome(nString);
        System.out.println(isPalindrome ? "Yes" : "No");
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        long parsed = Long.parseLong(reversed);

        String str1 = Long.toString(parsed);
        String reversed1 = new StringBuilder(Long.toString(parsed)).reverse().toString();

        return reversed1.equals(str1);
    }
}
