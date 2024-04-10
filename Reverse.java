import java.util.Scanner;

public class Reverse {
    // Method to reverse a given number
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Process: Reverse the number using the reverseNumber method
        int reversedNum = reverseNumber(num);

        // Output: Display the reversed number
        System.out.println("Reverse of " + num + " is " + reversedNum);

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
