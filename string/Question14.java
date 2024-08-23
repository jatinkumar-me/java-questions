import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Question14
 */
public class Question14 {

    public static void main(String[] args) {
        String input = "hello world hello java world";
        System.out.println("String after removing duplicates: " + removeDuplicateWords(input));
    }

    private static String removeDuplicateWords(String str) {
        String[] words = str.split("\\s+");
        Set<String> wordSet = new LinkedHashSet<>(Arrays.asList(words));
        return String.join(" ", wordSet);
    }
}
