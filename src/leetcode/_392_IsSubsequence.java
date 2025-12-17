package leetcode;

//392
public class _392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int s_pointer = 0;
        int t_pointer = 0;
        while ((s_pointer < s.length()) && (t_pointer < t.length())) {
            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer++;
            }
            t_pointer++;
        }
        return s_pointer == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }
}
