package leetcode;

import java.util.Stack;

//20
public class ValidParentheses implements TestSolution {

    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    @Override
    public void test() {
        System.out.println(isValid("()[]{}"));
    }
}
