package chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekdayProvider {
    private final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        boolean again;
        WeekdayProvider weekarray = new WeekdayProvider();
        String[] weekdays = weekarray.Weekdays();

        // normal do while loop

        do{
            int chosenNumber = weekarray.pickedNumber();
            System.out.println(weekdays[chosenNumber - 1]);
            System.out.println("Do you want to play again, true or false");
            Scanner scan = new Scanner(System.in);
            again = scan.nextBoolean();
        }while(again);

    }

    // method for the days of the week
    public String[] Weekdays() {
        return new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    // enter input method. Anything that is not a number is cut and taken care of.
    public int pickedNumber() {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter a number, your choice should be between 1 to 7: ");
                number = scan.nextInt();

                if (number >= 1 && number <= 7) {
                    System.out.println("Number is: " + number);
                    validInput = true;
                } else {
                    System.out.println("Number chosen is not in range.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next(); // Clear the invalid input from the scanner
            }
        }

        return number;
    }
}
