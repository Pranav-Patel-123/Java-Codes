import java.util.*;
class ASCIIval{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chracter");
        char c = sc.nextLine().charAt(0);

        System.out.println("The ASCII value of " + c + " is " + ((int)c));
        sc.close();
    }
}