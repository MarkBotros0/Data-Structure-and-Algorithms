package coach_academy_course.week7;

import java.util.Scanner;

public class J_FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] freq = new int[100_001];
            boolean beautiful = true;

            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if (freq[val] > 0) {
                    beautiful = false;
                }
                freq[val]++;
            }
            System.out.println(beautiful ? "prekrasnyy" : "ne krasivo");
        }
    }
}
/*
3 2 4
91 94
92 97
97 99
92 94
93 97
95 96
90 100
 */

