package leetcode;

import java.util.HashMap;

public class _290_WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] wordsArr = s.split(" ");
        if (pattern.length() != wordsArr.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!wordsArr[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if (map.containsValue(wordsArr[i]))
                    return false;
                map.put(pattern.charAt(i), wordsArr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
