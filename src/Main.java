import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Something then press enter:");
        String input = scanner.nextLine();
        System.out.println("Hello "+input);

        System.out.println("Hello Dexx");
        System.out.println("How old are you?");
        Integer age = scanner.nextInt();



        int[]myArray = new int[3];
        int[]myArray2 = {1,2,3,4};
        myArray[0]= 58;
        myArray[1]= 89;
        myArray[2]= 74;

        if (age <= 20){
            System.out.println("you are not legal to drink");

        } else if (age >= 21) {
            System.out.println("you are legal to drink");

        }
        else {
            System.out.println("try again");
        }

        System.out.println("the array number is "+ myArray[0]);
        System.out.println("the array number is "+ myArray[1]);
        System.out.println("the array number is "+ myArray[2]);

    }

}