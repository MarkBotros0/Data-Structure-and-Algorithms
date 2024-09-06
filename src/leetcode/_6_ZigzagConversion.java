package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _6_ZigzagConversion implements TestSolution {

/*
(1, 1)
(3, 4)
(4, 6)
(5, 8)
(6, 10)
(n, 2*(n-1))
 */


    public String convert(String s, int numRows) {
        StringBuilder finalWord = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            StringBuilder sb = new StringBuilder();
            list.add(sb);
            while (index < s.length()) {
                if (){
                sb.append(s.charAt(index));
                index = index + (2 * (numRows - 1));
                }
            }
            index = i;
        }

        for (StringBuilder sb : list) {
            finalWord.append(sb);
        }

        return finalWord.toString();
    }

    @Override
    public void test() {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
