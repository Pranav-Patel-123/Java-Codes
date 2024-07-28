import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(inputString);

        System.out.println("String without spaces: " + stringWithoutSpaces);
        scanner.close();
    }

    private static String removeSpaces(String inputString) {
        return inputString.replaceAll("\\s", "");
    }
}
