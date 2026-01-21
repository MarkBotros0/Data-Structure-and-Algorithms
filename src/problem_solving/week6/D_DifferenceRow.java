package problem_solving.week6;

import java.util.Arrays;
import java.util.Scanner;

public class D_DifferenceRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i == n - 1) continue;
            System.out.print(" ");
        }
    }
}
