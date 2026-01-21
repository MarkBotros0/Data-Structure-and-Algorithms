package problem_solving.week6;

import java.util.Scanner;

public class F_LittleElephantAndBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        int firstZero = str.indexOf("0");
        int indexToSkip = (firstZero == -1) ? n - 1 : firstZero;

        StringBuilder sb = new StringBuilder(n - 1);
        for (int i = 0; i < n; i++) {
            if (i == indexToSkip) continue;
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
