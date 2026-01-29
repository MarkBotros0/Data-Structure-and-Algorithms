package coach_academy_course.week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        Set<Character> charSet = new HashSet<>();

        for (char c : name.toCharArray()) {
            charSet.add(c);
        }

        if (charSet.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
