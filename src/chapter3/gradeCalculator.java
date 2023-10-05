package chapter3;

import java.util.Scanner;

public class gradeCalculator {

    public static void main (String[] args) {
        // get the score of the student
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your score? ");
        int score = scan.nextInt();
        char grade;
        if (0 <= score && score <= 39) {
            grade = 'F';
            System.out.println("your grade is: " + grade);
        } else if (40 <= score && score <= 49) {
            grade = 'D';
            System.out.println("your grade is: " + grade);
        } else if (50 <= score && score <= 59) {
            grade = 'C';
            System.out.println("your grade is: " + grade);
        }
        else if(60 <= score && score <= 88 ) {
            grade = 'B';
            System.out.println("your grade is: " + grade);
        }
        else if(89 < score && score <= 100) {
            grade = 'A';
            System.out.println("your grade is: " + grade);
        }
        else{
            System.out.println("not in the range");
        }
    }

}

