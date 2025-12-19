package algorithms.excercise.recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorialIterative(4));

        long timeStart = System.nanoTime();
        System.out.println(findFactorialRecursive(BigInteger.valueOf(1000)));
        long timeFinish = System.nanoTime();

        System.out.println(timeFinish - timeStart);
        System.out.println(findFactorialRecursiveMemo(BigInteger.valueOf(1000)));
        long timeFinish2 = System.nanoTime();
        System.out.println(timeFinish2 - timeFinish);
    }

    private static int findFactorialIterative(int x) {
        int factorial = 1;
        for (int i = x; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    private static BigInteger findFactorialRecursive(BigInteger x) {
        if (x.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return x.multiply(findFactorialRecursive(x.subtract(BigInteger.ONE)));
    }

    private static BigInteger findFactorialRecursiveMemo(BigInteger x) {
        Map<BigInteger, BigInteger> memo = new HashMap<>();
        return findFactorialRecursiveMemoHelper(x, memo);
    }

    private static BigInteger findFactorialRecursiveMemoHelper(BigInteger x, Map<BigInteger, BigInteger> memo) {
        if (x.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        if (memo.containsKey(x)) {
            return memo.get(x);
        }
        BigInteger factorial = x.multiply(findFactorialRecursiveMemoHelper(x.subtract(BigInteger.ONE), memo));
        memo.put(x, factorial);

        return memo.get(x);
    }
}
