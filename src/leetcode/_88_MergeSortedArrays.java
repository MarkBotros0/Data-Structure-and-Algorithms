package leetcode;

import java.util.Arrays;

public class _88_MergeSortedArrays implements TestSolution{
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        int counter1 = m - 1;
        int counter2 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if ( counter2 < 0 || (counter1 >= 0 && nums1[counter1] >= nums2[counter2])) {
                nums1[i] = nums1[counter1];
                counter1--;
            } else if (counter1 < 0 || nums1[counter1] < nums2[counter2]){
                nums1[i] = nums2[counter2];
                counter2--;
            }
        }
        return nums1;
    }

    @Override
    public void test() {
        System.out.println(
                Arrays.toString(
                        this.merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3
                        )
                )
        );
    }
}
