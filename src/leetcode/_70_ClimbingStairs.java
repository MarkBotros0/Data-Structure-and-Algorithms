package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _70_ClimbingStairs implements TestSolution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return helper(n, map);
    }

    public int helper(int n, Map<Integer, Integer> map) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!map.containsKey(n)) {
            map.put(n, (helper(n - 1, map) + helper(n - 2, map)));
        }
        return map.get(n);
    }

    @Override
    public void test() {
        System.out.println(climbStairs(13));
    }
}
