package leetcode.recursion;

public class _344_ReverseString {

    public static char[] reverseString(char[] s) {
        return helper(0, s);
    }

    public static char[] helper(int index, char[] s) {
        if (index == s.length / 2) {
            return s;
        }
        char temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index -1] = temp;
        return helper(index + 1, s);
    }

    public static void main(String[] args) {
        char[] charArray = {'h', 'e', 'l', 'l', 'o', 'p'};
        System.out.println(reverseString(charArray));
    }
}
