package coach_academy_course.week1;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0;

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
