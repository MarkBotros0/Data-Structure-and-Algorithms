package coach_academy_course.week3;

import java.util.Scanner;

public class I_ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (String word : words) {
            if (word.length() == 2) {
                System.out.println(word);
                continue;
            }

            StringBuilder aBuilder = new StringBuilder(word.substring(0, 2));
            for (int i = 2; i < word.length(); i = i + 2) {
                aBuilder.append(word.charAt(i+1));
            }
            System.out.println(aBuilder);
        }
    }
}
