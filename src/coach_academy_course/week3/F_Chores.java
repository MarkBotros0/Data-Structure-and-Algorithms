package coach_academy_course.week3;

import java.util.Scanner;

public class F_Chores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i >= n - k) {
                sum += x;
            } else {
                sum += arr[i];
            }
        }

        System.out.print(sum);
    }
}
