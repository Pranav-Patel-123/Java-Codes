import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Reverse the string using char array
        String reversedString = reverseWithCharArray(originalString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to reverse a string using char array
    static String reverseWithCharArray(String str) {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices toward the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}
