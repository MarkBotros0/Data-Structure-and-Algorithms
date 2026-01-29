package coach_academy_course.week1;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        int scoreA= 0;
        int scoreB= 0;

        for (int i = 0; i < n; i++) {
            if (arrA[i] > arrB[i]) {
                scoreA++;
            } else if (arrA[i] < arrB[i]) {
                scoreB++;
            }
        }

        System.out.println(scoreA + " " + scoreB);
    }
}
