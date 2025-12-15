package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies implements TestSolution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxNo = Integer.MIN_VALUE;

        for (int candy : candies) {
            maxNo = Math.max(maxNo, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxNo);
        }
        return result;
    }

    @Override
    public void test() {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
}
