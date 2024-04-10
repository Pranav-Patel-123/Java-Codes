import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 1D array
        int[] array1D = read1DArray(scanner, "Enter the size of the 1D array:");

        // Display 1D array
        System.out.println("1D Array elements:");
        printArray(array1D);

        // Input for 2D array
        int[][] array2D = read2DArray(scanner, "Enter the number of rows for the 2D array:", "Enter the number of columns for the 2D array:");

        // Display 2D array
        System.out.println("2D Array elements:");
        printArray(array2D);

        scanner.close();
    }

    // Method to read 1D array from user input
    private static int[] read1DArray(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int size = scanner.nextInt();

        System.out.println("Enter elements for the 1D array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Method to read 2D array from user input
    private static int[][] read2DArray(Scanner scanner, String... prompts) {
        System.out.print(prompts[0]);
        int rows = scanner.nextInt();
        System.out.print(prompts[1]);
        int cols = scanner.nextInt();

        System.out.println("Enter elements for the 2D array:");
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    // Method to print 1D array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to print 2D array
    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
