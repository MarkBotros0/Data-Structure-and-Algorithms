package leetcode;

import java.util.Arrays;

//  14
public class LongestCommonPrefix implements TestSolution{

    public String longestCommonPrefix(String[] strs){
        if (strs.length == 1){
            return strs[0];
        }

        StringBuilder longestPrefixBuilder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)){
                return longestPrefixBuilder.toString();
            }
            longestPrefixBuilder.append(first.charAt(i));
        }
        return longestPrefixBuilder.toString();
    }

    public void test() {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}