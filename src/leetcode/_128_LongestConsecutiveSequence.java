package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _128_LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentStreak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] ints = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        System.out.println(longestConsecutive(ints));
    }
}
