package problem_solving.week6;

import java.util.Scanner;

public class G_TitForTat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            solve(arr, k);

        }
    }

    private static void solve(int[] arr, int k) {
        int start = 0;
        while (k > 0 && start != arr.length - 1) {
            if (arr[start] == 0) {
                start++;
            } else {
                arr[arr.length - 1]++;
                arr[start]--;
                k--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}

/*
9
2 97
88 59
2 98
84 89
2 89
0 98
3 16
0 98 93
3 40
0 75 98
4 158
0 76 98 14
4 318
0 94 94 85
5 406
91 99 99 46 68
5 201
0 0 70 91 97
 */

