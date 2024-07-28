import java.util.Scanner;
import java.util.Arrays;

public class Assignment2 {
    private int[] dataArray;
    private int targetSum;

    // Constructor
    public Assignment2() {
        // Initialize data members in the constructor
        dataArray = null;
        targetSum = 0;
    }

    // Function to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        dataArray = new int[size];
        System.out.println("Enter distinct integers for the array:");
        for (int i = 0; i < size; i++) {
            dataArray[i] = scanner.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum: ");
        targetSum = scanner.nextInt();
        scanner.close();
    }

    // Function to find and return two elements that sum up to the target sum
    public int[] numSum() {
        int[] result = new int[2];

        // Check each pair of elements in the array
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[i] + dataArray[j] == targetSum) {
                    // Found a pair with the target sum
                    result[0] = dataArray[i];
                    result[1] = dataArray[j];
                    return result;
                }
            }
        }

        // No pair found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Create an instance of the Assignment2 class
            Assignment2 assignment2 = new Assignment2();

            // Get data from the user
            assignment2.getData();

            // Find and display the result
            int[] result = assignment2.numSum();
            System.out.println("Result: " + Arrays.toString(result));

            // Ask whether to continue
            System.out.print("Do you want to continue? (Y/N): ");
            String choice = scanner.next().toUpperCase();
            if (!choice.equals("Y")) {
                break;  // Exit the loop if the user enters anything other than 'Y'
            }
        }
        scanner.close();
    }
}
