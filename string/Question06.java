import java.util.HashMap;

/**
 * Question06
 * Count Occurrences of Words in a String
 */
public class Question06 {

    public static void main(String[] args) {

        String input = "hello my name is jatin kumar, and your name is jatin";
        HashMap<String, Integer> freq = countOccurencesOfWords(input);
        System.out.println(freq);
    }

    private static HashMap<String, Integer> countOccurencesOfWords(String input) {
        String[] words = input.trim().split("\\s+");
        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        return freq;
    }
}
