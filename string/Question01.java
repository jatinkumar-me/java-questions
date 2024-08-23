import java.util.HashMap;
import java.util.Map;

/*
 * Question01
 * Java Program to Find the First Non-repeated Character in a String
 */
public class Question01 {
    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First non-repeated character: " + findFirstNonRepeatedCharacter(input));
    }

    private static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}
