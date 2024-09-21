package leetcode;

import java.util.*;

public class _228_SummaryRanges implements TestSolution {
    public List<String> summaryRanges(int[] nums) {
        int startingIndex = 0;
        int closingIndex = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                closingIndex++;
            } else if (i + 1 == nums.length) {
                result.add(printRange(nums[startingIndex], nums[closingIndex]));
            } else if (i + 1 < nums.length && nums[i] + 1 != nums[i + 1]) {
                result.add(printRange(nums[startingIndex], nums[closingIndex]));
                startingIndex = closingIndex + 1;
                closingIndex++;
            }
        }
        return result;
    }

    public List<String> summaryRanges1(int[] nums) {
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

    private String printRange(int rangeStart, int rangeEnd) {
        if (rangeEnd == rangeStart) {
            return Integer.toString(rangeStart);
        } else {
            return rangeStart + "->" + rangeEnd;
        }
    }

    @Override
    public void test() {
        int[] list = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(list));
    }
}
