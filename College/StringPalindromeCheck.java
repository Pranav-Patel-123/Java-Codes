import java.util.Scanner;

public class StringPalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(inputString);

        // Display the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends, moving towards the center
        while (left < right) {
            // If characters at the corresponding positions are not equal, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            // Move indices towards the center
            left++;
            right--;
        }

        // If the loop completes without returning, the string is a palindrome
        return true;
    }
}
