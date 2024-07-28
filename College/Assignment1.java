    import java.util.Scanner;

public class Assignment1 {
    private static long registrationCounter = 1000L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Continuous loop for participant registration
        while (true) {
            System.out.println("\nDo you want to register a new participant? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();

            // Check if user wants to register or exit
            if (choice.equals("yes")) {
                registerAndDisplayParticipantInfo(scanner);
            } else if (choice.equals("no")) {
                System.out.println("Exiting registration. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }

        scanner.close();
    }

    // Method to take input and display participant information
    private static void registerAndDisplayParticipantInfo(Scanner scanner) {
        System.out.print("Enter participant's full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact number: ");
        long contactNumber = getValidContactNumber(scanner);

        System.out.print("Enter participant's branch: ");
        String branch = scanner.nextLine();

        // Display participant information
        displayParticipantInfo(createParticipant(name, contactNumber, branch));
    }

    // Method to ensure valid contact number input
    private static long getValidContactNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter contact number: ");
            if (scanner.hasNextLong()) {
                long contactNumber = scanner.nextLong();
                scanner.nextLine(); // Consume the newline character
                return contactNumber;
            } else {
                System.out.println("Invalid input. Please enter a valid contact number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    // Method to create participant with a unique registration ID
    private static Participant createParticipant(String name, long contactNumber, String branch) {
        Participant participant = new Participant(name, contactNumber, branch);
        participant.generateRegistrationId(registrationCounter++);
        return participant;
    }

    // Method to display participant information
    private static void displayParticipantInfo(Participant participant) {
        System.out.println("Welcome, " + participant.getName() + "! Your registration ID is " + participant.getRegistrationId());
    }
}

class Participant {
    private String name;
    private long contactNumber;
    private String branch;
    private String registrationId;

    // Constructor for creating a participant
    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
    }

    // Method to generate a unique registration ID
    public void generateRegistrationId(long counter) {
        this.registrationId = "D" + counter;
    }

    // Getter methods for retrieving participant information
    public String getName() {
        return name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getBranch() {
        return branch;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}