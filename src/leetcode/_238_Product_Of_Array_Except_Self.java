package leetcode;

import java.util.Arrays;

public class _238_Product_Of_Array_Except_Self {
    public static int[] productExceptSelf1(int[] nums) {
        int numOfZeros = (int) Arrays.stream(nums).filter(num -> num == 0).count();
        if (numOfZeros > 1) {
            return new int[nums.length];
        }
        int totalProduct = 1;
        int[] answer = new int[nums.length];
        for (int num : nums) {
            if (numOfZeros == 1 && num == 0) {
                continue;
            } else {
                totalProduct *= num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (numOfZeros == 1 && nums[i] == 0) {
                answer[i] = totalProduct;
            } else if (numOfZeros == 1 && nums[i] != 0) {
                answer[i] = 0;
            } else {
                answer[i] = totalProduct / nums[i];
            }
        }
        return answer;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int numOfZeros = (int) Arrays.stream(nums).filter(num -> num == 0).count();
        if (numOfZeros > 1) {
            return new int[nums.length];
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                product *= nums[j];
            }
            answer[i] = product;
        }
        return answer;
    }

    public static int[] productExceptSelf3(int[] nums) {
        int n = nums.length;
        int[] pre = new int[nums.length];
        pre[0] = 1;
        int[] suff = new int[nums.length];
        suff[n - 1] = 1;
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static int[] productExceptSelf5(int[] nums) {
        int n = nums.length;
        int[] pre = new int[nums.length];
        pre[0] = 1;
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        int curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = pre[i] * curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static int[] productExceptSelf4(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(productExceptSelf5(nums)));
    }
}
