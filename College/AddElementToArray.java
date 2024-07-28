import java.util.Scanner;
import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the original array from the user
        System.out.print("Enter the number of elements in the original array: ");
        int originalSize = scanner.nextInt();

        // Create an original array with the specified size
        int[] originalArray = new int[originalSize];

        // Get the elements of the original array from the user
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < originalSize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // Get the value to add to the array
        System.out.print("Enter the value to add: ");
        int valueToAdd = scanner.nextInt();

        // Add the element to the array
        int[] newArray = addElement(originalArray, valueToAdd);

        // Display the modified array
        System.out.println("\nArray after adding " + valueToAdd + ": " + Arrays.toString(newArray));

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to add an element to the array
    static int[] addElement(int[] array, int valueToAdd) {
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Add the new element at the end of the new array
        newArray[newSize - 1] = valueToAdd;

        return newArray;
    }
}
