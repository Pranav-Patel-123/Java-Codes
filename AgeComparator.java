import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date of birth (yyyy-MM-dd):");
        String dob1 = scanner.nextLine();

        System.out.println("Enter the second date of birth (yyyy-MM-dd):");
        String dob2 = scanner.nextLine();

        compareDatesOfBirth(dob1, dob2);
        scanner.close();
    } 

    private static void compareDatesOfBirth(String dob1, String dob2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = sdf.parse(dob1);
            Date date2 = sdf.parse(dob2);

            if (date1.compareTo(date2) < 0) {
                System.out.println("The first person is younger than the second person.");
            } else if (date1.compareTo(date2) > 0) {
                System.out.println("The first person is older than the second person.");
            } else {
                System.out.println("Both persons have the same age.");
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
