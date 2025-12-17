package leetcode;

public class _9_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        StringBuilder builder = new StringBuilder(Integer.toString(x));

        String original = builder.toString();
        String reversed = builder.reverse().toString();

        return original.equals(reversed);
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0)
            return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            x /= 10;

            if (reversed > ((Integer.MAX_VALUE - digit) / 10)) {
                return false;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
        System.out.println(isPalindrome1(1234567899));
    }
}
