package leetcode;
import java.util.HashMap;
public class _205_IsomorphicStrings implements TestSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) ) {
                if (t.charAt(i) != map.get(s.charAt(i))){
                    return false;
                }
            } else {
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    @Override
    public void test() {
        System.out.println(isIsomorphic("baba", "badc"));
    }
}
