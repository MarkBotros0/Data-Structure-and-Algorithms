package coach_academy_course.week4;

import java.util.Scanner;
import java.util.Stack;

public class B_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }

        for (String s : strings) {
            System.out.println(isBalanced(s) ? "YES" : "NO");
        }
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                if (stack.pop() != getOpeningChar(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static char getOpeningChar(char c) {
        char result = ' ';
        switch (c) {
            case ')':
                result = '(';
                break;
            case ']':
                result = '[';
                break;
            case '}':
                result = '{';
                break;
        }
        return result;
    }
}
