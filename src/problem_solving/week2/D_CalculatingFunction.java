package problem_solving.week2;

import java.util.Scanner;

public class D_CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n % 2 == 1) {
            n = (n + 1)/ 2;
            n *= -1;
        } else {
            n /= 2;
        }

        System.out.println(n);
    }
}
