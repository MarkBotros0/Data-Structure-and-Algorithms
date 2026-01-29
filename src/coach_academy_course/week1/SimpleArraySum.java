package coach_academy_course.week1;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}
