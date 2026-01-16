package problem_solving.week2;

import java.util.Scanner;

public class A_ChildrenAndCandies_ABC_Edit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
