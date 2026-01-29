package coach_academy_course.week3;

import java.util.Scanner;

public class L_CountOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] firstPattern = new int[n];
        int[] secondPattern = new int[n];

        for (int i = 0; i < n; i++) {
            firstPattern[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            secondPattern[i] = sc.nextInt();
        }

        System.out.println(Math.abs(getRank(firstPattern) - getRank(secondPattern)));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int getRank(int[] arr) {
        int n = arr.length;
        int firstRank = factorial(n - 1) * (arr[0] - 1);

        for (int i = 1; i < n - 1; i++) {
            int numbersLessThanI = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    numbersLessThanI++;
                }
            }
            int increment = factorial(n - i - 1) * numbersLessThanI;
            firstRank += increment;
        }
        return firstRank;
    }
}