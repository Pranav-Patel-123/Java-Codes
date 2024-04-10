// for input form user
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment1 assignment1 = new Assignment1();
        while (true) {
            System.out.println("\nDo you want to input a new participant? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("yes")) {
                assignment1.takeAndDisplayParticipantInfo(scanner);
            } else if (choice.equals("no")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }

        scanner.close();
    }

    // Method to take input and display Participant information
    private void takeAndDisplayParticipantInfo(Scanner scanner) {
        System.out.print("Enter participant name: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact number: ");
        long contactNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        createAndDisplayParticipant(name, contactNumber, branch);
    }

    // Method to create and display Participant object
    private void createAndDisplayParticipant(String name, long contactNumber, String branch) {
        Participant participant = new Participant(name, contactNumber, branch);

        // Displaying participant information
        displayParticipantInfo(participant);
    }

    // Method to display participant information
    private void displayParticipantInfo(Participant participant) {
        System.out.println(
                "Hi " + participant.getName() + "! Your registration ID is " + participant.getRegistrationId());
    }
}

class Participant {
    private String name;
    private long contactNumber;
    private String branch;
    private String registrationId;
    private static long counter;

    static {
        counter = 1000L;
    }

    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        generateRegistrationId();
    }

    private void generateRegistrationId() {
        counter++;
        registrationId = "D" + counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}
