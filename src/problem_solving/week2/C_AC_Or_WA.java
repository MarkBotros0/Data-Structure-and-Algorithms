package problem_solving.week2;

import java.util.Scanner;

public class C_AC_Or_WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String result = (n == m) ? "Yes" : "No";

        System.out.println(result);
    }
}
