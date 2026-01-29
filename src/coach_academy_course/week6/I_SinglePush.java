package coach_academy_course.week6;

import java.util.Arrays;
import java.util.Scanner;

public class I_SinglePush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] inputSrc = new int[n][];
        int[][] inputTarget = new int[n][];

        getInput(sc, inputSrc, inputTarget);

        for (int i = 0; i < n; i++) {
            if (Arrays.equals(inputSrc[i], inputTarget[i])) {
                System.out.println("YES");
                continue;
            }
            int length = inputSrc[i].length;
            int pointer1 = 0;
            int pointer2 = length - 1;

            while ((inputSrc[i][pointer1] == inputTarget[i][pointer1]
                    || inputSrc[i][pointer2] == inputTarget[i][pointer2])
                    && pointer2 > pointer1) {
                if (inputSrc[i][pointer1] == inputTarget[i][pointer1]) {
                    pointer1++;
                }
                if (inputSrc[i][pointer2] == inputTarget[i][pointer2]) {
                    pointer2--;
                }
            }

            int diff = inputTarget[i][pointer1] - inputSrc[i][pointer1];
            if (diff <= 0) {
                System.out.println("NO");
                continue;
            }

            boolean flag = false;
            for (int j = pointer1; j <= pointer2; j++) {
                if (inputTarget[i][j] - diff != inputSrc[i][j]) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "NO" : "YES");
        }
    }

    private static void getInput(Scanner sc, int[][] inputSrc, int[][] inputTarget) {
        for (int i = 0; i < inputSrc.length; i++) {
            int arrN = sc.nextInt();
            int[] src = new int[arrN];
            int[] target = new int[arrN];

            for (int j = 0; j < arrN; j++) {
                src[j] = sc.nextInt();
            }
            for (int j = 0; j < arrN; j++) {
                target[j] = sc.nextInt();
            }
            inputSrc[i] = src;
            inputTarget[i] = target;
        }
    }
}


/*
20
1
1
1000
3
2 4 6
3 5 7
5
3 3 3 3 3
3 3 6 6 6
5
3 3 3 3 3
6 6 6 3 3
5
7 7 7 7 7
7 8 8 9 7
3
1 2 3
2 2 4
5
7 7 7 7 7
7 7 8 8 9
5
7 7 7 7 7
9 8 8 7 7
5
7 7 7 7 7
8 9 9 7 7
5
7 7 7 7 7
7 7 9 8 8
1
1
1
6
10 20 30 40 50 60
10 20 25 35 50 60
5
10 20 30 40 50
10 25 40 50 50
5
10 20 30 40 50
10 30 40 45 50
5
10 20 30 40 50
10 30 35 50 50
5
10 20 30 40 50
10 30 45 50 50
7
10 10 10 10 10 10 10
10 20 20 30 20 30 10
2
10 20
15 25
2
10 20
15 30
2
10 20
17 15
------------------------------
YES 0
YES 1
YES 2
YES 3
NO 4
NO 5
NO 6
NO 7
NO 8
NO 9
YES 10
NO 11
NO 12
NO 13
NO 14
NO 15
NO 16
YES 17
NO 18
NO 19
 */