package coach_academy_course.week6;

import java.util.Scanner;

public class C_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val > 0) {
                sumB += val;
            } else {
                sumC += val;
            }
        }

        System.out.print(sumB - sumC);
    }
}
