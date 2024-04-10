import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number of subjects
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        // Input: Get marks for each subject and calculate total marks
        int totalMarks = 0;
        System.out.println("Enter the marks for the subjects:");
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += scanner.nextInt();
        }

        // Calculate average as a float
        float average = (float) totalMarks / numSubjects;

        // Output: Display the percentage of the student
        System.out.println("The percentage of the student is " + average);

        scanner.close();
    }
}