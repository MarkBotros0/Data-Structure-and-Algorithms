package leetcode;

import java.util.Arrays;

public class _80_RemoveDuplicatesFromSortedArrayII implements TestSolution{
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (counter == 1 || nums[i] != nums[counter - 2]) {
                nums[counter] = nums[i];
                counter++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return counter;
    }

    @Override
    public void test() {
        System.out.println(this.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

}
