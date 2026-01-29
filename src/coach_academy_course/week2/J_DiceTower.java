package coach_academy_course.week2;

import java.util.Scanner;

public class J_DiceTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int top = sc.nextInt();
        int bottom = 7 - top;

        int[][] dices = new int[n][2];

        for (int i = 0; i < dices.length; i++) {
            dices[i][0] = sc.nextInt();
            dices[i][1] = sc.nextInt();
        }

        String result = "YES";

        for (int[] dice : dices) {
            if (dice[0] == top || dice[1] == top || dice[0] == bottom || dice[1] == bottom) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
