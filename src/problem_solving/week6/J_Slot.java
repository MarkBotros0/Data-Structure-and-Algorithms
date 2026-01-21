package problem_solving.week6;

import java.util.Scanner;

public class J_Slot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2) ? "Won" : "Lost")   ;
    }
}
