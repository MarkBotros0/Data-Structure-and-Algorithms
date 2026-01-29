package coach_academy_course.week5;

import java.util.Scanner;

public class F_KeyboardProblem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dir = sc.next();
        String str = sc.next();

        String keyboard = "qwertyuiop[]asdfghjkl;'zxcvbnm,./";

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            int shift = dir.equals("R") ? -1 : 1;
            sb.append(keyboard.charAt(keyboard.indexOf(c) + shift));
        }
        System.out.println(sb);
    }
}
