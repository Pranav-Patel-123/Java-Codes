import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println("The given strings are anagrams.");
        } else { 
            System.out.println("The given strings are not anagrams.");
        }
        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
