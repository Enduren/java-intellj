import java.util.Scanner;

public class DayChecker {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., Monday, Saturday):");
    String day = scanner.nextLine().trim();

    // .toLowerCase() makes the search case-insensitive
        switch (day.toLowerCase()) {
            case "saturday":
            case "sunday":
                System.out.println(day + " is a HOLIDAY!");
                break;

            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            System.out.println(day + " is a weekday.");
            break;

            default:
                System.out.println("That's not a valid day of the week.");
                break;
        }
    }
}
