import java.util.HashSet;
import java.util.Set;

/**
 * Question03
 * Find Duplicate Characters in a String
 */
public class Question03 {

    public static void main(String[] args) {
        String input = "mississipi";
        Set<Character> duplicates = findDuplicateCharacters(input);
        System.out.println(duplicates);
    }

    private static Set<Character> findDuplicateCharacters(String input) {
        Set<Character> characters = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (characters.contains(ch)) {
                duplicates.add(ch);
            }
            characters.add(ch);
        }

        return duplicates;
    }
}
