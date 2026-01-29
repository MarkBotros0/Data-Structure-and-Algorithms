package coach_academy_course.week3;

import java.util.Scanner;

public class K_ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int maxIndex = 0, minIndex = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (min >= arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int overlap = maxIndex > minIndex ? 1 : 0;
        System.out.println((maxIndex) + (n - minIndex - 1) - overlap);
    }
}
