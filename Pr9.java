import java.time.LocalDate;
import java.util.Scanner;

public class Pr9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter day (1-31): ");
        int day = inp.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = inp.nextInt();

        System.out.print("Enter year: ");
        int year = inp.nextInt();
        LocalDate localDate = LocalDate.of(year, month, day);

        System.out.println("LocalDate from input numbers: " + localDate);

        inp.close();
    }
}
