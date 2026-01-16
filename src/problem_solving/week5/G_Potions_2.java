package problem_solving.week5;

import java.util.Scanner;

public class G_Potions_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            int nextVal = sc.nextInt();
            if (nextVal + result < 0) {
                continue;
            }
            result += nextVal;
            counter++;
        }

        System.out.println(counter);
    }
}
