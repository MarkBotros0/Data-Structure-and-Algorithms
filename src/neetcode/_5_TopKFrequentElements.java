package neetcode;

import java.util.*;

public class _5_TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));

        int[] arr1 = new int[]{7, 7};
        System.out.println(Arrays.toString(topKFrequent(arr1, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .mapToInt(Map.Entry::getKey)
                .limit(k)
                .toArray();
    }
}
