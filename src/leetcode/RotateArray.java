package leetcode;

import java.util.Arrays;

//189
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int curr = nums[0];
        int counter = 0;
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (counter + 1 >= nums.length) {
                    counter = counter + 1 - nums.length;
                } else {
                    counter++;
                }
                int temp = curr;
                curr = nums[counter];
                nums[counter] = temp;
            }
        }
    }

    public void test() {
        RotateArray test = new RotateArray();
        test.rotate(new int[]{-1, -100, 3, 99}, 2);
    }
}
