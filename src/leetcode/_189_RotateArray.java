package leetcode;

import java.util.Arrays;

public class _189_RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int counter = 0;
        int[] arr = new int[k];

        for (int j = nums.length - k; j < nums.length; j++) {
            arr[counter] = nums[j];
            counter++;

        }

        for (int i = nums.length-k-1; i >= 0; i--) {
                nums[i + k] = nums[i];
            }

        for (int z = 0; z < k; z++) {
            nums[z] = arr[z];
        }
        System.out.println(Arrays.toString(nums));
    }

    public void test() {
        _189_RotateArray test = new _189_RotateArray();
        test.rotate(new int[]{-1, -100, 3, 99, 9, 10, 22}, 2);
    }
}
