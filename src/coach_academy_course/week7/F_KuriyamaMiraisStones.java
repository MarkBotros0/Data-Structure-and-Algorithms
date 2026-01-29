package coach_academy_course.week7;

import java.util.Arrays;
import java.util.Scanner;

public class F_KuriyamaMiraisStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] v = new long[n + 1];
        long[] vSum = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            v[i] = val;
            vSum[i] = vSum[i - 1] + val;
        }

        Arrays.sort(v, 1, n + 1);

        for (int i = 1; i <= n; i++) {
            v[i] = v[i - 1] + v[i];
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (type == 1) {
                System.out.println(vSum[r] - vSum[l - 1]);
            } else {
                System.out.println(v[r] - v[l - 1]);
            }
        }
    }
}

/*
6
6 4 2 7 2 7
3
2 3 6
1 3 4
1 1 6
-------------
4
5 5 2 3
10
1 2 4
2 1 4
1 1 1
2 1 4
2 1 2
1 1 1
1 3 3
1 1 3
1 4 4
1 2 2
 */

