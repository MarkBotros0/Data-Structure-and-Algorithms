package coach_academy_course.week2;

import java.util.Scanner;

public class F_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        char ref = str.charAt(0);
        int toRemove = 0;

        for (int i = 1; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ref) {
                toRemove++;
            } else {
                ref = ch;
            }
        }

        System.out.println(toRemove);
    }
}
