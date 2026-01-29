package coach_academy_course.week7;

import java.util.Scanner;

public class A_EqualizeTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[101];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            freq[val]++;
            max = Math.max(max, freq[val]);
        }

        System.out.println(n - max);
    }
}
