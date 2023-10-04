package chapter2;

import java.util.Scanner;

public class simple_Algorithm_coding {
    public static void main(String[] arg){

        // get the name of a season of the year form the users
        System.out.print("Please what season of the year would you like to choose? ");
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        // get the number of cups of tea that they drink in the season
        System.out.print("Please what number of cups do you take within a day? ");
        int numbers = scan.nextInt();
        // get the adjective describing the season
        System.out.print("Please what adjective would describe the season? ");
        String adjective = scan.next();
        scan.close();
        // use all the input to write a sentence
        System.out.print("On a "+ adjective +" "+ season+ " i would normally take in "+ numbers + " cups of tea");
    }
}
