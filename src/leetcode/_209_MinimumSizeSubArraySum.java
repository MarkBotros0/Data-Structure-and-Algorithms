package leetcode;

public class _209_MinimumSizeSubArraySum {

    public static int minSubArrayLen(int target, int[] nums) {
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

    public static int minSubArrayLen1(int target, int[] nums) {
        int minsteps = Integer.MAX_VALUE;
        int c1 = 0, c2 = 0, sum = 0;

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

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(7, nums));
        System.out.println(minSubArrayLen1(7, nums));
    }
}
