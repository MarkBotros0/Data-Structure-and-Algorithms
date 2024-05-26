package leetcode;

import java.util.Arrays;

//242
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

       return Arrays.equals(sArr,tArr) ? true : false;
    }
}
