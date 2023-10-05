package chapter3;

import java.util.Scanner;

public class logicOperatorLoanQualifier {

    public static void main(String[] args){

        // define the known variables
        int minimunSalaryForTheLoan = 30000;
        int minimumYears = 3;

        // define the unknown variables

        System.out.println("Please input the number of years you have been with your current employer? ");
        Scanner scan = new Scanner(System.in);
        int yearsSpent = scan.nextInt();
        System.out.println("Please input the your gross pay at the end of the month? ");
        double grossPay = scan.nextDouble();

        if(grossPay >= minimunSalaryForTheLoan && yearsSpent >= minimumYears){
          System.out.println("YOU QUALIFY FOR THE LOAN");
        }
        else {
            System.out.println("YOU ARE NOT QUALIFIED FOR THE LOAN");
        }
    }

}
