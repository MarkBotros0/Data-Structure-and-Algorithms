package coach_academy_course.week1;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
