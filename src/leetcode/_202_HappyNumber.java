package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _202_HappyNumber {
    public static boolean isHappy(int n) {
        int result = n;
        int i = 0;
        while (result != 1) {
            List<Integer> digits = getDigits(result);
            result = getSumSquared(digits);
            if (i > 10) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }

    public static int getSumSquared(List<Integer> digits) {
        int result = 0;
        for (int i : digits) {
            result += (i * i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
