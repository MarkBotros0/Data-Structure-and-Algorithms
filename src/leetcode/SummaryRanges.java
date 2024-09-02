package leetcode;

import java.util.*;

public class SummaryRanges implements TestSolution {

    public List<String> summaryRanges(int[] nums) {

        List<String> summeryList = new ArrayList<>();

        if (nums.length == 0) {
            return summeryList;
        }

        int min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == max + 1) {
                max = nums[i + 1];
            } else {
                if (max == min) {
                    summeryList.add(Integer.toString(min));
                } else {
                    summeryList.add(Integer.toString(min) + "->" + Integer.toString(max));
                }
                min = nums[i + 1];
                max = nums[i + 1];
            }
        }
        return summeryList;
    }

    @Override
    public void test() {
        int[] list = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(list));
    }
}
