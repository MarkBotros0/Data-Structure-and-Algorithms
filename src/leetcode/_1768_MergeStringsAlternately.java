package leetcode;

//  1768
public class _1768_MergeStringsAlternately implements TestSolution {

    public String mergeAlternately(String word1, String word2) {
        String biggerWord = word1.length() > word2.length() ? word1 : word2;
        int smallerLength = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < smallerLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(biggerWord, smallerLength, biggerWord.length());
        return sb.toString();
    }

    @Override
    public void test() {
        _1768_MergeStringsAlternately obj = new _1768_MergeStringsAlternately();
        System.out.println(obj.mergeAlternately("Mark", "Essam"));
    }
}
