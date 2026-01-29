package coach_academy_course.week1;

import java.util.Scanner;

public class B_BreakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int minCount = 0;
        int max = arr[0];
        int maxCount = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                minCount++;
                min = arr[i];
            } else if (arr[i] > max) {
                maxCount++;
                max = arr[i];
            }
        }

        System.out.println(maxCount + " " + minCount);
    }
}
