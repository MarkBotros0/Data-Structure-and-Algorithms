package leetcode;

import java.util.Arrays;

public class _14_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder longestPrefixBuilder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return longestPrefixBuilder.toString();
            }
            longestPrefixBuilder.append(first.charAt(i));
        }
        return longestPrefixBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

}