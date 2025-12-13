package leetcode;

import java.util.Arrays;

public class _209_MinimumSizeSubArraySum implements TestSolution {

    public int minSubArrayLen(int target, int[] nums) {
        int minsteps = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length - i; j++) {
                sum += nums[j + i];
                if (sum >= target) {
                    minsteps = Math.min(minsteps, j + 1);
                    break;
                }
            }
        }
        return minsteps == Integer.MAX_VALUE ? 0 : minsteps;
    }

    public int minSubArrayLen1(int target, int[] nums) {
        int minsteps = Integer.MAX_VALUE;
        int c1 = 0, c2 = 0, sum =0;

        while (c2 < nums.length || sum >= target) {
            if (sum >= target) {
                minsteps = Math.min(minsteps, c2 - c1);
                sum -= nums[c1];
                c1++;
            } else {
                sum += nums[c2];
                c2++;
            }
        }
        return minsteps == Integer.MAX_VALUE ? 0 : minsteps;
    }

    @Override
    public void test() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen1(7, nums));
    }
}
