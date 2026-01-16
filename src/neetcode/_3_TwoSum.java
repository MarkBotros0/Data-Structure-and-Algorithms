package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3_TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}
