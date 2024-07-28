import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the number of words
        int wordCount = countWords(inputString);

        // Display the result
        System.out.println("Number of words in the string: " + wordCount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to count the number of words in a string
    static int countWords(String str) {
        int wordCount = 0;
        boolean inWord = false;

        // Iterate through the characters of the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a space, tab, or newline
            if (ch == ' ' || ch == '\t' || ch == '\n') {
                // If the previous character was part of a word, increment the word count
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                // The character is not a space, tab, or newline, so it is part of a word
                inWord = true;
            }
        }

        // Increment the word count if the last character is part of a word
        if (inWord) {
            wordCount++;
        }

        return wordCount;
    }
}
