import java.util.Scanner;

public class HeapSort {

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

        System.out.println("\nOriginal array:");
        printArray(array);

        heapSort(array);

        System.out.println("\nSorted array:");
        printArray(array);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to perform Heap Sort on the given array
    static void heapSort(int[] array) {
        int n = array.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify the reduced heap
            heapify(array, i, 0);
        }
    }

    // Function to heapify a subtree rooted with the node i which is an index in the array
    static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // Left child
        int rightChild = 2 * i + 2; // Right child

        // If left child is larger than root
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // If right child is larger than the largest so far
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // If the largest is not the root
        if (largest != i) {
            // Swap array[i] and array[largest]
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }

    // Utility function to print an array
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
