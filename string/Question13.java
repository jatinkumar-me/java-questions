import java.util.Arrays;

/**
 * Question13
 * Merge Two String Arrays:
 */
public class Question13 {

   public static void main(String[] args) {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        String[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    private static String[] mergeArrays(String[] array1, String[] array2) {
        String[] merged = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }
}
