package chapter6;

import java.util.Scanner;

/******
 **Title: Simple Banking Application**
 **Description:**
 * This program is a simple banking application that facilitates account owners
 * in withdrawing, depositing, and checking their balance after withdrawing and depositing.

 * **Highlights:**
 - If the user's account balance is insufficient, the program will display a message
     indicating that the balance isn't enough.
 - If the withdrawal amount is within the available balance, it will be deducted from the account.
 - When the deposit method is called, the specified amount will be added to the available
      balance and shown to the user.
 - If a balance inquiry is made, the previous balance will be displayed to the user.

 **Implementation Details:**
 * For this construction, fields, classes, and objects are utilized to
 ensure code reusability and maintainability.
 * This description outlines the purpose of the banking application, the key functionalities it provides, and the approach used to make the code reusable and maintainable. If you have any specific questions or if you need the code implementation, feel free to ask!
 */
public class simpleBankingProcess {
    // defining the fields
    String actNumber;
    double depositAmount;
    double withdrawnAmount;
    // the balance will be set to $100,000 for simplicity
    double accountBalance = 100000;
    static Scanner scan = new Scanner(System.in);

    // method for deposit
    void deposit(String accountNumber,double amt){
        actNumber = accountNumber;
        withdrawnAmount = amt;
        double Total = accountBalance + amt;
        System.out.println("Account number: "+ accountNumber);
        System.out.println("You account balance is "+ Total);
        System.out.println("The amount deposited was "+ amt );
    }
    // method for withdrawal
    void withdrawal(String accountNumber,double witamt){
         actNumber = accountNumber;
        depositAmount = witamt;
        if(witamt >= accountBalance){
            System.out.println("Account number: "+ accountNumber);
            System.out.println("Insufficient balance");
        }
        else if (witamt > 1){
            double tax = 0.1 * witamt;
            double Total = accountBalance - (witamt + tax);
            System.out.println("Account number: "+ accountNumber);
            System.out.println("You account balance is "+ Total);
            System.out.println("The amount withdrawn was "+ witamt +" and the you were taxed "+ tax);

        }
        else if(witamt <= 0){
            System.out.println("Account number: "+ accountNumber);
            System.out.println("You account balance is " +accountBalance);
            System.out.println("This is an incorrect input");
        }
    }


    // main method
    public static void main(String[] args) {
        // creating the object an instance of the class
        simpleBankingProcess deposit = new simpleBankingProcess();
        System.out.println("Please pick which operation you would love to, 1 for deposit, 2 for withdrawal: ");
        int option = scan.nextInt();
        if (option == 1){
            System.out.println("enter the amount you want to deposit: ");
            double amount = scan.nextDouble();

            deposit.deposit("007775752", amount);
        }
        else if(option == 2){
            System.out.println("enter the amount you want to withdraw: ");
            double amount = scan.nextDouble();
            deposit.withdrawal("007775752", amount);
        }



    }


}

