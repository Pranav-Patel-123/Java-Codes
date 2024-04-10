// Tester.java
public class Tester {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.createAndDisplayParticipants();
    }

    // Non-static method to create and display Participant objects
    private void createAndDisplayParticipants() {
        Participant participant1 = new Participant("John Doe", 1234567890, "Computer Science");
        Participant participant2 = new Participant("Jane Smith", 9876543210L, "Electrical Engineering");

        // Displaying participant information
        displayParticipantInfo(participant1);
        displayParticipantInfo(participant2);
    }

    // Method to display participant information
    private void displayParticipantInfo(Participant participant) {
        System.out.println("Name: " + participant.getName());
        System.out.println("Contact Number: " + participant.getContactNumber());
        System.out.println("Branch: " + participant.getBranch());
        System.out.println("Registration ID: " + participant.getRegistrationId());
        System.out.println("----------------------------");
    }
}
