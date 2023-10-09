package chapter4;

import java.util.Scanner;

public class averageStudentScore {
    static Scanner scan = new Scanner(System.in);
    private static int numberOfTestScore = 4;
    public static void main(String[] args){

        System.out.println("enter the number of students: ");
        int numberofstudents = scan.nextInt();
        int i , j;
        for (i=0; i < numberofstudents; i++){
            System.out.println("enter the name of the student: ");
            String name = scan.next();
            double total = 0;

            for(j=0; j< numberOfTestScore; j++){
                System.out.println("input the score of test nos "+ j+1 + " for " + name + " :");
                double score = scan.nextDouble();
                total = total +score;
            }
             double averageScore = total / numberOfTestScore;
            System.out.println(name+ "'s average score for the semester is: "+ averageScore);
             gradingSystem(averageScore);
            }

        }


    public static void gradingSystem(double score){
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

