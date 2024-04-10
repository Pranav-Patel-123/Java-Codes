import java.util.Scanner;

public class Armstrong {
    static void armer(String n, int l) {
        int sum = 0, rem = 0;
        int num = Integer.parseInt(n);  
        int tempNum = num; 

        while (tempNum > 0) {
            rem = tempNum % 10;
            sum += Math.pow(rem, l);
            tempNum = tempNum / 10;
        }

        if (num == sum) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String num = scanner.next();
        int l = num.length();
        armer(num, l);
        scanner.close();
    }
}