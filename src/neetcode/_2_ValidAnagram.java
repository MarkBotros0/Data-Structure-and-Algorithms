package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2_ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagramSort(s, t));
        System.out.println(isAnagramMap(s, t));
        String s1 = "jar", t1 = "jam";
        System.out.println(isAnagramSort(s1, t1));
        System.out.println(isAnagramMap(s1, t1));
    }

    public static boolean isAnagramSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        boolean isAnagram = true;

        for (int i = 0; i < s.length(); i++) {
            if (sChars[i] != tChars[i]) {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }

    public static boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : countMap.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}
