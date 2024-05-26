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

    @Override
    public void test() {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 4));

    }
}
