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
