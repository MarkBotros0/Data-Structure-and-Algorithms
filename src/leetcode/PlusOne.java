package leetcode;

import java.util.*;

//66
public class PlusOne implements TestSolution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    @Override
    public void test() {
        int[] sample = {9, 9, 9, 9};
        plusOne(sample);
    }
}
