/**
 * Question10
 * Count Number of Words in Given String
 */
public class Question10 {

    public static void main(String[] args) {
        String input = "hello world how are you";
        System.out.println("Number of words: " + countWords(input));
    }

    private static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
