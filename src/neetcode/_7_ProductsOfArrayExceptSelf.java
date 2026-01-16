package neetcode;

import java.util.Arrays;

public class _7_ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, 3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf1(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
            } else {
                product *= num;
            }
        }

        if (zeros > 1) return result;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = product;
            } else if (nums[i] != 0 && zeros > 0)
                result[i] = 0;
            else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
