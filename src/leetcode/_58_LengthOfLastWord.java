package leetcode;
public class _58_LengthOfLastWord implements TestSolution{

    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        char[] chars = strArr[strArr.length-1].toCharArray();
        return chars.length;
    }

    @Override
    public void test() {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
