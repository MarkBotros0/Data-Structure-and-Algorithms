package neetcode;

import java.util.*;

public class _4_GroupAnagrams {
    public static void main(String[] args) {
        String[] strings = new String[]{"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> listMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (listMap.containsKey(sortedString)) {
             listMap.get(sortedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                listMap.put(sortedString, list);
            }
        }

        return new ArrayList<>(listMap.values());
    }
}
