package chapter3;

import java.util.Scanner;

/*
the loan qualifier is one that uses
the if else statement to handle the question of how much the applicant earns as gross pay
 */
public class LoanQualifier {
    public static void main(String[] arg){
        // declare the know statement
        int minimumSalary = 30000;
        int minimumYear = 3;
        // conditions for the loan applications
        System.out.println("Please input you gross pay? ");
        Scanner scan = new Scanner(System.in);
        double gross_pay = scan.nextInt();
        System.out.println("Now please put in the amount of years you have worked in with your current employer? ");
        double years = scan.nextInt();
        scan.close();

        if(gross_pay >= minimumSalary){
            if(years >= minimumYear){
                System.out.print("Congratulations....You qualify for the loan");
            }
            else{
                System.out.println("Unfortunately you do " +
                        "not meet the minimum amount of years need for this loan. " +
                        "The minimum amount of years is "+ minimumYear);
            }
        }
        else{
            System.out.println("You do not qualify for the loan because your gross pay is not enough");
        }

    }
}
