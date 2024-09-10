package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _6_ZigzagConversion implements TestSolution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> sbArr = new ArrayList<>();
        int counter = 0;
        int variance = 1;
        for (int i = 0; i < numRows; i++) {
            sbArr.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            sbArr.get(counter).append(s.charAt(i));
            counter += variance;
            if (counter == numRows-1) {
                variance = -1;
            } else if (variance == -1 && counter == 0) {
                variance = 1;
            }
        }
        StringBuilder finalString = new StringBuilder();
        for (StringBuilder sb : sbArr) {
            finalString.append(sb.toString());
        }
        return finalString.toString();
    }

    @Override
    public void test() {
        System.out.println(convert("PAYPALISHIRING",4));

    }
}
