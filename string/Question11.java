/**
 * Question11
 * Count the Number of Occurrences of Substring in a String
 */
public class Question11 {

    public static void main(String[] args) {
        String input = "hellohellohello";
        String substring = "hello";
        System.out.println("Number of occurrences: " + countSubstringOccurrences(input, substring));
    }

    private static int countSubstringOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }
}
