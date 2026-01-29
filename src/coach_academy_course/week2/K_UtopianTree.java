package coach_academy_course.week2;

import java.util.Scanner;

public class K_UtopianTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int cycles : arr) {
            int height = 1;

            for (int i = 1; i <= cycles; i++) {
                if (i % 2 == 1) {
                    height *= 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}
