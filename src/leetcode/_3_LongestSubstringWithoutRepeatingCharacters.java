package leetcode;

import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharacters implements TestSolution {
    public int lengthOfLongestSubstring(String s) {
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

    @Override
    public void test() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
