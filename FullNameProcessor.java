import java.util.Scanner;

public class FullNameProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        displayInitialsAndLastName(fullName);
        scanner.close();
    }

    private static void displayInitialsAndLastName(String fullName) {
        String[] names = fullName.split(" ");

        String firstName = names[0];
        String middleName = names.length > 2 ? names[1] : "";
        String lastName = names[names.length - 1];

        System.out.println("Initials: " + firstName.charAt(0) + middleName.charAt(0) + " Last Name: " + lastName);
    }
}
