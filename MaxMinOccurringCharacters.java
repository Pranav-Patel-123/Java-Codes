import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxMinOccurringCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the maximum and minimum occurring characters
        char maxChar = findMaxOccurringCharacter(inputString);
        char minChar = findMinOccurringCharacter(inputString);

        // Display the result
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to find the maximum occurring character in a string
    static char findMaxOccurringCharacter(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum frequency
        char maxChar = ' ';
        int maxFrequency = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

    // Function to find the minimum occurring character in a string
    static char findMinOccurringCharacter(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the minimum frequency
        char minChar = ' ';
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                minChar = entry.getKey();
            }
        }

        return minChar;
    }
}
