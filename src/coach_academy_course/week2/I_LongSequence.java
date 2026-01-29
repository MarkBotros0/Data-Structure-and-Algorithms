package coach_academy_course.week2;

import java.util.Scanner;

public class I_LongSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        long target = sc.nextLong();

        long k = target / sum;
        long result = n * k;
        long totalSum = sum * k;

        for (int i = 0; i < n; i++) {
            if (totalSum > target) {
                break;
            } else {
                totalSum += arr[i];
                result++;
            }
        }
        System.out.println(result);
    }
}
