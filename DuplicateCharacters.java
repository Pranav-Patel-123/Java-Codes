import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Print the duplicate characters
        printDuplicateCharacters(inputString);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to print duplicate characters in a string
    static void printDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");

        for (HashMap.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
