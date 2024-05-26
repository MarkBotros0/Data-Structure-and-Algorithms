package leetcode;

public class PalindromeNumber implements TestSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder builder = new StringBuilder(Integer.toString(x));

        String original = builder.toString();
        String reversed = builder.reverse().toString();

        return original.equals(reversed);
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) return false;

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

    @Override
    public void test() {
        System.out.println(isPalindrome1(1234567899));
    }
}
