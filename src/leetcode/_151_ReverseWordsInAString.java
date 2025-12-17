package leetcode;

public class _151_ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] newStringArray = s.trim().split(" ");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < newStringArray.length; i++) {
            if (newStringArray[newStringArray.length - i - 1].length() != 0) {
                string.append(newStringArray[newStringArray.length - i - 1]);
                if (i != newStringArray.length - 1) {
                    string.append(" ");
                }
            }
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
