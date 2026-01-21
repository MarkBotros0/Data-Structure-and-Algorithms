package problem_solving.week6;

import java.util.Scanner;

public class H_DenseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] innerArr = new int[m];
            for (int j = 0; j < m; j++) {
                innerArr[j] = sc.nextInt();
            }
            getStepsCount(innerArr);
        }
    }

    private static void getStepsCount(int[] arr) {
        int increase = 0;
        for (int i = 1; i < arr.length; i++) {
            int min = Math.min(arr[i - 1], arr[i]);
            int max = Math.max(arr[i - 1], arr[i]);

            while (min * 2 < max) {
                min *= 2;
                increase++;
            }
        }
        System.out.println(increase);
    }
}
/*
4
4 2 10 1
--------------
6
4
4 2 10 1
2
1 3
2
6 1
3
1 4 2
5
1 2 3 4 3
12
4 31 25 50 30 20 34 46 42 16 15 16

*/