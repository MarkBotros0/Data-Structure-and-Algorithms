package neetcode;

import java.util.*;

public class _9_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 20, 4, 10, 3, 4, 5};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] == arr[i] - 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
