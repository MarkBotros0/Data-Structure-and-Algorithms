package leetcode;

import java.util.Arrays;
// 35
public class SearchInsertPosition implements TestSolution {
    public int searchInsert(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        if (result < 0) {
//           (-(insertion point) -1) = result -> insertion point = (result * -1) - 1
            return (result * -1) - 1;
        }
        return result;
    }
    public int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    @Override
    public void test() {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 4));

    }
}
