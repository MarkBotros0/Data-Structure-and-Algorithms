package leetcode;

import java.util.HashMap;

//219
public class ContainsDuplicateII implements TestSolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    @Override
    public void test() {
        int[] ints = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(ints, 1));
    }
}
