import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 1;
        int dividend = 10;
        int divisor = 0;
        int size = 3;
        int[] arr = {1, 2, 3};
        int index = 5;
        String str = null;

        try {
            int result = divideByZero(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            int element = getElementAt(arr, index);
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            int length = getStringLength(str);
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Exiting program...");

        scanner.close();
    }

    public static int divideByZero(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divide by zero exception");
        }
        return dividend / divisor;
    }

    public static int getElementAt(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    public static int getStringLength(String str) throws NullPointerException {
        return str.length();
    }
}
