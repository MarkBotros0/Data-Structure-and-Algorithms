package algorithms.excercise.recursion;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(findPascalTriangle(4, 2));
    }

    public static int findPascalTriangle(int x, int y) {
        if (y == 0 || x == y) {
            return 1;
        }
        return findPascalTriangle(x-1, y-1) + findPascalTriangle(x-1, y);
    }
}
