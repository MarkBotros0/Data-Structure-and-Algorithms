package coach_academy_course.week7;

import java.util.Scanner;

public class E_KarenAndCoffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] degreeCount = new int[200000 + 2];
        int[] freqOfNeeded = new int[200000 + 2];

        for (int i = 1; i <= n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            degreeCount[l]++;
            degreeCount[r + 1]--;
        }

        int count = 0;
        for (int i = 1; i < degreeCount.length; i++) {
            degreeCount[i] += degreeCount[i - 1];
            if (degreeCount[i] >= k) {
                count++;
            }
            freqOfNeeded[i] = count;
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(freqOfNeeded[r] - freqOfNeeded[l - 1]);
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

