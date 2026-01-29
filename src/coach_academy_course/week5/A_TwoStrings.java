package coach_academy_course.week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            hasCommonSubstring(sc.next(), sc.next());
        }
    }

    private static void hasCommonSubstring(String s1, String s2) {
        Set<Character> charSet = new HashSet<>();

        String smallerString = s1.length() > s2.length() ? s2 : s1;
        String largerString = smallerString == s1 ? s2 : s1;

        for (char c : smallerString.toCharArray()) {
            charSet.add(c);
        }

        for (char c : largerString.toCharArray()) {
            if (charSet.contains(c)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
