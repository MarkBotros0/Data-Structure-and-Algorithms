package leetcode;
//58
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        char[] chars = strArr[strArr.length-1].toCharArray();
        return chars.length;
    }

}
