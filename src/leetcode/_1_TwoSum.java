package leetcode;

import java.util.HashMap;
import java.util.Arrays;

public class _1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            } else {
                map.put(comp, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numsArr = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(numsArr, 9)));
    }
}
