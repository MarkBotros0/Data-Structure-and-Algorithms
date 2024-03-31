package algorithms.excercise;

public class Excercise {

    // O(n)
    public int findFactorialRecursive(int number) {
        if (number == 1) {
            return number;
        }
        return number * this.findFactorialRecursive(number - 1);
    }

    // O(n)
    public int findFactorialIterative(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    // O(2^n)
    public int fibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        }
        return this.fibonacciRecursive(n - 1) + this.fibonacciRecursive(n - 2);
    }

    // O(n)
    public int fibonacciIterative(int n) {
        int counter1 = 0;
        int counter2 = 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]);
        }
        return arr[n];
    }

    public String reverseStringRecursive(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String reversed = change(str); // Reverse the string
        return reverseStringRecursive(reversed.substring(1, reversed.length() - 1)) + reversed.charAt(0) + reversed.charAt(reversed.length() - 1);
    }

    public String change(String str) {
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public void run() {
//        System.out.println(this.findFactorialRecursive(5));
//        System.out.println(this.findFactorialIterative(5));
//        System.out.println(this.fibonacciIterative(45));
//        System.out.println(this.fibonacciRecursive(45));
        System.out.println(this.reverseStringRecursive("hello world"));

    }
}
