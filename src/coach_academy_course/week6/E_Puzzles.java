package coach_academy_course.week6;

import java.util.*;

public class E_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int diff = arr[i + n - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}
