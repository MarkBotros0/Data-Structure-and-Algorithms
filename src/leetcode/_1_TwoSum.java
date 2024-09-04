package leetcode;

import java.util.HashMap;

// 1
public class _1_TwoSum implements TestSolution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(comp, i);
            }
        }
        return null;
    }

    @Override
    public void test() {
        int[] numsArr = {2, 7, 11, 15};
        System.out.println(twoSum(numsArr, 9));
    }
}
