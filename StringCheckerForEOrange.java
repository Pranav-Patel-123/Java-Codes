import java.util.Scanner;

public class StringCheckerForEOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        if (containsEAndOrange(inputString)) {
            System.out.println("The string contains the character 'e' and the word 'orange'.");
        } else {
            System.out.println("The string does not meet the criteria.");
        }
        scanner.close();
    }

    private static boolean containsEAndOrange(String inputString) {
        return inputString.contains("e") && inputString.contains("orange");
    }
}
