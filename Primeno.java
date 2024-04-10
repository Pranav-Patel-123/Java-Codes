import java.util.*;
class Primeno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int c = 0;
        for (int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                c = c + 1;
            }
        }
        if (c == 2)
        System.out.println(number + " is a prime number");
        else
        System.out.println(number + " is not a prime number");

        sc.close();
    }
}