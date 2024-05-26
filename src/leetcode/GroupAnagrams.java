package leetcode;

import com.sun.source.tree.NewArrayTree;

import java.util.*;
//49
public class GroupAnagrams implements TestSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(s);
                map.put(sortedString, arr);
            }
        }

        return new ArrayList<>(map.values());
    }

    @Override
    public void test() {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
}
