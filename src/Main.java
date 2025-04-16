import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the date(MM/dd/yyyy): ");
        String date = scanner.nextLine();
        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate movieTime = LocalDate.parse(date,formatter);
        System.out.println(tickets + " tickets reserved for " + movieTime + " under " + name);
    }
}