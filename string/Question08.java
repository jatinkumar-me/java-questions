/**
 * Question08
 * Count Vowels and Consonants in a String
 */
public class Question08 {
    public static void main(String[] args) {
        String input = "hello world";
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }

    private static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] { vowels, consonants };
    }
}
