package leetcode;

import java.util.HashMap;

//290
public class WordPattern implements TestSolution {
    public boolean wordPattern(String pattern, String s) {
        String[] wordsArr = s.split(" ");
        if (pattern.length() != wordsArr.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!wordsArr[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if (map.containsValue(wordsArr[i])) return false;
                map.put(pattern.charAt(i), wordsArr[i]);
            }
        }
        return true;
    }

    @Override
    public void test() {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}
