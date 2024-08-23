import java.util.HashMap;
import java.util.Map;

/**
 * Question09
 * Count the number of duplicate words
 */
public class Question09 {

    public static void main(String[] args) {
        String input = "hello world hello java world";
        System.out.println("Number of duplicate words: " + countDuplicateWords(input));
    }

    private static int countDuplicateWords(String str) {
        String[] words = str.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int duplicates = 0;

        for (int count : wordCount.values()) {
            if (count > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }
}
