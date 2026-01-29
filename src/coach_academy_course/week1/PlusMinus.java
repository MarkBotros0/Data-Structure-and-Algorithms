package coach_academy_course.week1;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();
        float[] arr = new float[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.6f \n", positiveCount / n);
        System.out.printf("%.6f \n", negativeCount / n);
        System.out.printf("%.6f \n", zeroCount / n);
    }
}
