package leetcode;

public class _58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        char[] chars = strArr[strArr.length - 1].toCharArray();
        return chars.length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
