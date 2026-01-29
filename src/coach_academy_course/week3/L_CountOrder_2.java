package coach_academy_course.week3;

import java.util.Scanner;

public class L_CountOrder_2 {
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
        int[] factorials = getFactorials(n);

//        7 3 5 4 2 1 6 8
//        6 2 3 2 1 0 0 0

//        3 8 2 5 4 6 7 1
//        2 6 1 2 1 1 1 0

//        int rank = 1;
//        rank+=factorials[7] * 6;
//        rank+=factorials[6] * 2;
//        rank+=factorials[5] * 3;
//        rank+=factorials[4] * 2;
//        rank+=factorials[3] * 1;
//        rank+=factorials[2] * 0;
//        rank+=factorials[1] * 0;
//        rank+=factorials[0] * 0;

        int[] firstRightSmallerCount = getRightSmallerCount(firstPattern);
        int[] secondRightSmallerCount = getRightSmallerCount(secondPattern);

        int firstRank = getRank(firstRightSmallerCount, factorials);
        int secondRank = getRank(secondRightSmallerCount, factorials);

        System.out.println(Math.abs(firstRank - secondRank));
    }

    private static int getRank(int[] rightSmallerCount, int[] factorials) {
        int rank = 1;
        for (int i = 0; i < rightSmallerCount.length; i++) {
            rank += factorials[rightSmallerCount.length - i - 1] * rightSmallerCount[i];
        }
        return rank;
    }

    private static int[] getFactorials(int maxVal) {
        int[] factorials = new int[maxVal];

        factorials[0] = 0;

        int factorial = 1;

        for (int i = 1; i < maxVal; i++) {
            factorials[i] = factorial * i;
            factorial *= i;
        }
        return factorials;
    }

    private static int[] getRightSmallerCount(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}