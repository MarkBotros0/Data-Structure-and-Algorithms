package leetcode;

//  1768
public class _1768_MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
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

    public static void main(String[] args) {
        System.out.println(mergeAlternately("Mark", "Essam"));
    }
}
