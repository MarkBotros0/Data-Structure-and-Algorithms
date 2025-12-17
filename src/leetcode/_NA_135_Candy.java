package leetcode;

public class _NA_135_Candy {

    public static int candy(int[] ratings) {
        int sum = 1;
        for (int i = 1; i < ratings.length; i++) {
            sum++;
            if (ratings[i] != ratings[i - 1]) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 0, 2}));
        System.out.println(candy(new int[]{1, 2, 2}));
        System.out.println(candy(new int[]{1, 3, 2, 2, 1}));
    }
}
