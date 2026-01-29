package coach_academy_course.week2;

import java.util.Arrays;
import java.util.Scanner;

public class H_ReplacingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean found = arr[0] + arr[1] <= d || arr[arr.length - 1] <= d;
            System.out.println(found ? "YES" : "NO");
        }
    }
}
