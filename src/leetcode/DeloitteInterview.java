package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DeloitteInterview implements TestSolution {

        public int solution(String S) {
            // Split the string into sentences using ., !, and ? as delimiters
            String[] sentences = S.split("[.?!]");
            int maxWords = 0;

            for (String sentence : sentences) {
                // Trim and split each sentence into words based on spaces
                String[] words = sentence.trim().split(" ");
                int wordCount = 0;

                for (String word : words) {
                    if (!word.isEmpty()) { // Ignore empty strings due to multiple spaces
                        wordCount++;
                    }
                }

                // Update maxWords if current sentence has more words
                maxWords = Math.max(maxWords, wordCount);
            }

            return maxWords;
        }


        public int solution2(String S) {
            String[] sentences = S.split("[.?!]");
            int maxWords = 0;

            for (String sentence : sentences) {
                String[] words = sentence.trim().split(" ");
                int wordCount = 0;

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }

                maxWords = Math.max(maxWords, wordCount);
            }

            return maxWords;
        }

    @Override
    public void test() {
        System.out.println(solution("We test coders. Give us a try?"));
    }
}
