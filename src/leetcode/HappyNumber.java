package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//202
public class HappyNumber implements TestSolution {
    public boolean isHappy(int n) {
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

    public List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }

    public int getSumSquared(List<Integer> digits) {
        int result = 0;
        for (int i : digits) {
            result += (i * i);
        }
        return result;
    }

    @Override
    public void test() {
        System.out.println(isHappy(19));
    }
}
