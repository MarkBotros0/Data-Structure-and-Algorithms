package leetcode;

import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> charSet = new HashSet<>();
            int c = i;
            while (c < s.length() && !charSet.contains(s.charAt(c))) {
                charSet.add(s.charAt(c));
                c++;
            }
            maxLen = Math.max(maxLen, charSet.size());
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
