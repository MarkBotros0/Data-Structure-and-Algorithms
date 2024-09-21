package leetcode;

public class _NA_12_IntegerToRoman implements TestSolution {
    /*
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
 */

    public String intToRoman(int num) {

        int[] specialIntegers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] specialRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < specialRoman.length; i++) {
            if (num < specialIntegers[i]) {

            }

        }
        return "";
    }

    @Override
    public void test() {

    }
}
