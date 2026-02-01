import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class LuckyWinner {
    public static void main(String[] args) {
        // Define your lucky number
        int luckyNumber = 7;

        // Generate random number between 1 and 100
        // .nextInt(origin, bound) -> bound is exclusive, so we use 101
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("The number generated is: " + randomNumber);

        // Check if you won
        if (randomNumber == luckyNumber) {
            System.out.println("Congratulations! You are a winner!");
        } else {
            System.out.println("Not this time. Please try again!");
        }
    }
}

