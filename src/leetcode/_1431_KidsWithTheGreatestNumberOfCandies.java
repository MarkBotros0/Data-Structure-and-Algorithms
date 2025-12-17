package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
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

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
    }
}
