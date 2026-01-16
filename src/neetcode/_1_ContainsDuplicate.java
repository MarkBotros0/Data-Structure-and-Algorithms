package neetcode;

import java.util.HashSet;
import java.util.Set;

public class _1_ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[] {1, 2, 3, 3}));
        System.out.println(hasDuplicate(new int[] {1, 2, 3}));
    }

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
