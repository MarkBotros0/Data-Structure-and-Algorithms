package leetcode;

public class _125_ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
        StringBuilder builder = new StringBuilder(result);
        return result.equals(builder.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
