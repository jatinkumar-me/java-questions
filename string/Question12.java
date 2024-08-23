import java.util.HashMap;
import java.util.Map;

/**
 * Question12
 * Count the Occurrences of Each Character in String
 */
public class Question12 {

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Character occurrences: " + countCharacterOccurrences(input));
    }

    private static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
