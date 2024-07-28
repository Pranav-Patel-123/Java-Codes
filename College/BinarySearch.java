import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the sorted array from the user
        System.out.print("Enter the number of elements in the sorted array: ");
        int size = scanner.nextInt();

        // Create a sorted array with the specified size
        int[] array = new int[size];

        // Get the elements of the sorted array from the user
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the target value to search
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(array, target);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to perform binary search on the given sorted array
    static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not present in the array
        return -1;
    }
}
