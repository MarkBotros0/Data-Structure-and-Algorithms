package neetcode;

public class _10_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome1("Was it a car or a cat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        String newStr = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(newStr);
        return sb.toString().contentEquals(sb.reverse());
    }

    public static boolean isPalindrome1(String s) {
        int pointer1 = 0, pointer2 = s.length() - 1;
        String newString = s.toLowerCase();

        while (pointer2 > pointer1) {
            if (!Character.isLetterOrDigit(newString.charAt(pointer1))) {
                pointer1++;
                continue;
            }
            if (!Character.isLetterOrDigit(newString.charAt(pointer2))) {
                pointer2--;
                continue;
            }

            if (newString.charAt(pointer1) == newString.charAt(pointer2)) {
                pointer1++;
                pointer2--;
            } else {
                return false;
            }
        }
        return true;
    }
}
