package leetcode;

public class _13_RomanToInteger {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (i != chars.length - 1 && c == 'I' && chars[i + 1] == 'V') {
                result += 4;
                i++;
            } else if (i != chars.length - 1 && c == 'I' && chars[i + 1] == 'X') {
                result += 9;
                i++;
            } else if (i != chars.length - 1 && c == 'X' && chars[i + 1] == 'L') {
                result += 40;
                i++;
            } else if (i != chars.length - 1 && c == 'X' && chars[i + 1] == 'C') {
                result += 90;
                i++;
            } else if (i != chars.length - 1 && c == 'C' && chars[i + 1] == 'D') {
                result += 400;
                i++;
            } else if (i != chars.length - 1 && c == 'C' && chars[i + 1] == 'M') {
                result += 900;
                i++;
            } else {
                switch (c) {
                    case 'I' -> result++;
                    case 'V' -> result += 5;
                    case 'X' -> result += 10;
                    case 'L' -> result += 50;
                    case 'C' -> result += 100;
                    case 'D' -> result += 500;
                    case 'M' -> result += 1000;
                }
            }
        }
        return result;
    }
}
