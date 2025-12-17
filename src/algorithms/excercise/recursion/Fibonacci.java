package algorithms.excercise.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonacciIterative(8));
        System.out.println(findFibonacciRecursive(8));
    }

    private static int findFibonacciIterative(int x) {
        int first = 0;
        int second = 1;
        for (int i = 1; i < x; i++) {
            int temp = second;
            second += first;
            first = temp;
        }
        return second;
    }

    private static int findFibonacciRecursive(int x) {
        if (x < 3) {
            return 1;
        }
        return findFibonacciRecursive(x - 1) + findFibonacciRecursive(x - 2);
    }
}
