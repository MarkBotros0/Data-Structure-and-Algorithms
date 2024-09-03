package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15
public class _3Sum implements TestSolution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrayOfTriplets = new ArrayList<>();
        int firstIndex = 0;
        int middleIndex = 1;
        int lastIndex = nums.length - 1;
        int sumOfTwoIntegers = nums[firstIndex] + nums[lastIndex];
        while (lastIndex - firstIndex >= 2) {
            if (sumOfTwoIntegers + nums[middleIndex] == 0) {
                List<Integer> list = new ArrayList<>(Arrays.asList(nums[firstIndex], nums[middleIndex], nums[lastIndex]));
                arrayOfTriplets.add(list);
            }
            middleIndex++;
            if (lastIndex == middleIndex) {
                lastIndex--;
                middleIndex = firstIndex + 1;
                sumOfTwoIntegers = nums[firstIndex] + nums[lastIndex];
            }
        }
        return arrayOfTriplets;
    }

    @Override
    public void test() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(numbers));
    }
}
