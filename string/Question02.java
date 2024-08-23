/**
 * Question02
 * Java Program to Check Palindrome String
 */
public class Question02 {

   public static void main(String[] args) {
      String input = "reviver";
      String input2 = "revivor";

      System.out.println(isPalindrome(input));
      System.out.println(isPalindrome(input2));
   }

   private static boolean isPalindrome(String input) {
      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
            return false;
         }
      }
      return true;
   }
}
