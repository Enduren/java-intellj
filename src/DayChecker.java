import java.util.Scanner;

public class DayChecker {


        // This is your function (method)
        public static void checkDayType(String day) {
            if (day == null || day.isEmpty()) {
                System.out.println("Please provide a valid day.");
                return;
            }

            switch (day.toLowerCase().trim()) {
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
