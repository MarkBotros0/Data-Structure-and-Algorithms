package leetcode;

import java.util.HashMap;

public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > nums.length / 2) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return 0;
    }
}
