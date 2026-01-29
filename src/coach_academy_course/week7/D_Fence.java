package coach_academy_course.week7;

import java.util.Scanner;

public class D_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + sc.nextInt();
        }

        int pointer = 0, resultIndex = 0, minDiff = Integer.MAX_VALUE;

        while (pointer + k <= n) {
            int diff = prefixSum[pointer + k] - prefixSum[pointer];
            if (diff < minDiff) {
                minDiff = diff;
                resultIndex = pointer;
            }
            pointer++;
        }
        System.out.println(resultIndex + 1);
    }
}

/*
6
6 4 2 7 2 7
3
2 3 6
1 3 4
1 1 6
-------------
4
5 5 2 3
10
1 2 4
2 1 4
1 1 1
2 1 4
2 1 2
1 1 1
1 3 3
1 1 3
1 4 4
1 2 2
 */

