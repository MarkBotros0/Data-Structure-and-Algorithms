package coach_academy_course.week2;

import java.util.Scanner;

public class B_AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();

        int result = (n == 0) ? 1 : (n == 1) ? 5 : 25;

        System.out.println(result);
    }
}
