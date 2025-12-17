package leetcode;

import java.util.*;

public class _15_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrayOfTriplets = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    arrayOfTriplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return arrayOfTriplets;
    }

    public static void main(String[] args) {
        int[] numbers = { -1, 0, 1, 2, -1, -4 };
        int[] numbers2 = { 0, 0, 0, 0 };
        System.out.println(threeSum(numbers2));
    }
}
