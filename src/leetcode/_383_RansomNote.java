package leetcode;

import java.util.HashMap;

public class _383_RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            } else {
                magazineMap.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (magazineMap.containsKey(c) && magazineMap.get(c) > 0) {
                magazineMap.put(c, magazineMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
