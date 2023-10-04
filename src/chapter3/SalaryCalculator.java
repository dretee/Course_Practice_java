package chapter3;

import java.util.Scanner;

/*
This program is a simple program to help build the foundation of the if statement.
A company add a bonus to their employees salary each time they exceed 10 sales
write a code to automate this
 */
public class SalaryCalculator {
    public static void main(String[] arg){
        // known variables
        int BasicSalary = 1000;
        int MinimumSalesForBonus = 10;
        int bonus = 250;
                Scanner scan = new Scanner(System.in);
        //getting the name of the staff and the amount of sales and giving the output
        System.out.println(" Please what the name of the staff? ");
        String Name = scan.next();
        // Number of the Sales
        System.out.println("Please input the numbaer of sale made by "+ Name);
        int NumberOfSales = scan.nextInt();

        if (NumberOfSales >= MinimumSalesForBonus){
            BasicSalary = BasicSalary + bonus;
            System.out.println("The salary of " + Name + " is " + BasicSalary + " after " +
                    "the bonus of "+ bonus + " was added");
        }
        else{
            System.out.println("The salary of " + Name + " is " + BasicSalary);

        }

    }
}
