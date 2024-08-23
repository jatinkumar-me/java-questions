import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * Question04
 * Find Duplicate Words in a String
 */
public class Question04 {
    public static void main(String[] args) {
        String input = "hello world hello java world";
        System.out.println("Duplicate words: " + findDuplicateWords(input));
    }

    private static Set<String> findDuplicateWords(String str) {
        String[] words = str.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
