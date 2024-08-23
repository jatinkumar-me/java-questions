import java.util.HashSet;
import java.util.Set;

/**
 * Question05
 * Find All the Permutations of a String:
 */
public class Question05 {

    static Set<String> permutations;

    public static void main(String[] args) {
        String input = "ABC";
        permutations = new HashSet<>();
        findPermutations(input, "");
        System.out.println(permutations);
    }

    private static void findPermutations(String input, String prefix) {
        if (input.isEmpty()) {
            permutations.add(prefix);
        }

        for (int i = 0; i < input.length(); i++) {
            findPermutations(input.substring(0, i) + input.substring(i + 1), prefix + input.charAt(i));
        }
    }
}
