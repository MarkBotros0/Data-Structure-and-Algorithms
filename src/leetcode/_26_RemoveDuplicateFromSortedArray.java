package leetcode;

import java.util.HashMap;

public class _26_RemoveDuplicateFromSortedArray implements TestSolution{

    public int removeDuplicates1(int[] nums) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    public int removeDuplicates2(int[] nums) {
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[counter-1]){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void test() {
        System.out.println(removeDuplicates1(new int[]{1,1,2,2,3,3,4}));
    }
}
