package leetcode.recursion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _119_PascalTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(findPascalTriangle(rowIndex, i));
        }
        return list;
    }

    public static int findPascalTriangle(int x, int y) {
        if (y == 0 || x == y) {
            return 1;
        }
        return findPascalTriangle(x-1, y-1) + findPascalTriangle(x-1, y);
    }

    public static List<Integer> getRowMemo(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(findPascalTriangleMemo(rowIndex, i, memo));
        }
        return list;
    }

    public static int findPascalTriangleMemo(int x, int y, Map<String, Integer> memo) {
        if (y == 0 || x == y) {
            return 1;
        }
        String key = x + "_" + y;
        if (!memo.containsKey(key)) {
            memo.put(key, findPascalTriangleMemo(x - 1, y - 1, memo) + findPascalTriangleMemo(x - 1, y, memo));
        }
        return memo.get(key);
    }

    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        System.out.println(getRowMemo(30));
        long timeFinish = System.nanoTime();
        System.out.println(Duration.ofNanos(timeFinish - timeStart).toMillis());
        System.out.println(getRow(30));
        long timeFinish2 = System.nanoTime();
        System.out.println(Duration.ofNanos(timeFinish2 - timeFinish).toMillis());
    }

}
