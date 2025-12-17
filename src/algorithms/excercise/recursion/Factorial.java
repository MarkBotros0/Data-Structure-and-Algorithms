package algorithms.excercise.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorialIterative(4));
        System.out.println(findFactorialRecursive(4));
    }

    private static int findFactorialIterative(int x) {
        int factorial = 1;
        for (int i = x; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    private static int findFactorialRecursive(int x) {
        if (x == 1) {
            return 1;
        }
        return x * findFactorialRecursive(--x);
    }
}
