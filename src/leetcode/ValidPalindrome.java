package leetcode;

//125
public class ValidPalindrome implements TestSolution {

    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
        StringBuilder builder = new StringBuilder(result);
        return result.equals(builder.reverse().toString());
    }

    @Override
    public void test() {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
