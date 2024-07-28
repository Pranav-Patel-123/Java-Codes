import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove the specified character
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Display the modified string
        System.out.println("String after removing '" + charToRemove + "': " + modifiedString);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to remove a character from a string
    static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        // Iterate through the characters of the original string
        for (char ch : str.toCharArray()) {
            // Append the character to the result if it is not equal to the specified character
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
