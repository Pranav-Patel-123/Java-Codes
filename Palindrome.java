import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        // Declare variables to store digits, original number, and the reversed number
        int r, n, sum = 0, temp;

        // Prompt the user to enter a number
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        // Read the entered number and store it in 'n' and 'temp'
        n = sc.nextInt();
        temp = n;

        // Reverse the number using a while loop
        while (n > 0) {
            r = n % 10; // Extract the last digit
            sum = (sum * 10) + r; // Build the reversed number
            n = n / 10; // Remove the last digit
        }

        // Check if the reversed number is equal to the original number
        if (temp == sum) {
            System.out.println("The number " + temp + " is a Palindrome");
        } else {
            System.out.println("The number " + temp + " is not a Palindrome");
        }

        // Close the Scanner to avoid resource leakage
        sc.close();
    }
}
