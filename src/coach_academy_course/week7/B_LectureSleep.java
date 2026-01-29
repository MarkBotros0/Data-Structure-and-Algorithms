package coach_academy_course.week7;

import java.util.Scanner;

public class B_LectureSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];

        int tempVal2 = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            a[i] = val;
        }

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == 1) {
                tempVal2 += a[i];
                a[i] = 0;
            }

        }

        temp[0] = a[0];
        int max = temp[0];

        for (int i = 1; i < n; i++) {
            if (i < k) {
                temp[i] = temp[i - 1] + a[i];
            } else {
                temp[i] = temp[i - 1] + a[i] - a[i - k];
            }
            max = Math.max(max, temp[i]);
        }

        System.out.println(max + tempVal2);
    }
}
