import java.util.Scanner;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array with the specified size
        int[] array = new int[size];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the value to remove from the array
        System.out.print("Enter the value to remove: ");
        int valueToRemove = scanner.nextInt();

        // Remove the element from the array
        array = removeElement(array, valueToRemove);

        // Display the modified array
        System.out.println("\nArray after removing " + valueToRemove + ":");
        printArray(array);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to remove an element from the array
    static int[] removeElement(int[] array, int valueToRemove) {
        int newSize = array.length - 1;
        int[] newArray = new int[newSize];

        int newArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArray[newArrayIndex++] = array[i];
            }
        }
        return newArray;
    }

    // Utility function to print an array
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
