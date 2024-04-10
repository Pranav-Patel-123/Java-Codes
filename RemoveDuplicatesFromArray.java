import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

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

        // Remove duplicate elements
        int[] arrayWithoutDuplicates = removeDuplicates(array);

        // Display the modified array
        System.out.println("\nArray without duplicates: " + Arrays.toString(arrayWithoutDuplicates));

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to remove duplicate elements from the array
    static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int length = 0;

        // Iterate through the array, adding elements to the set
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i])) {
                length++;
            }
        }

        // Create a new array with unique elements
        int[] newArray = new int[length];
        int index = 0;

        // Copy unique elements from the set to the new array
        for (int num : set) {
            newArray[index++] = num;
        }

        return newArray;
    }
}
