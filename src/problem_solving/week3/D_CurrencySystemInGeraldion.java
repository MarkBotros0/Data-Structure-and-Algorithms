package problem_solving.week3;

import java.util.Scanner;

public class D_CurrencySystemInGeraldion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean foundOne = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                foundOne = true;
                break;
            }
        }

        System.out.print(foundOne ? "-1" : "1");
    }
}
