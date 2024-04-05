package Assignments.Assignment1;

import java.util.Scanner;

public class StudentGrade {

    /*You are tasked with developing a Java program that checks a student's grade based on their score. The grading system is as follows:

    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    E: 0-59 (Fail)
    Write a Java program that takes the student's score as input and
    determines and displays the corresponding grade based on the above criteria.
    Ensure that the program handles invalid input gracefully and provides
    appropriate feedback.*/

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student score to check grade :");
        int score = scanner.nextInt();


        if(score >= 90 || score >= 100 ) {

            System.out.println("Student Grade is : A ");
        }else if(score >= 80 || score >= 89){

            System.out.println("Student grade is : B");

        }else if (score >= 70 || score >= 79){

            System.out.println("Student grade is : C");
        }else if (score >= 60 || score >= 69){

            System.out.println("Student grade is : D");
        }else if ( score <= 59){

            System.out.println("Student Failed");
        }else{
            System.out.println("Invalid input please re-enter again between 0 to 100");
        }scanner.close();


    }
}
