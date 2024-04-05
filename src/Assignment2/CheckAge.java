package Assignment2;

import java.util.Scanner;

public class CheckAge {

   // Write a Java program that takes a user's age as input and determines whether they are eligible to vote or not.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age to check eligibilty for Voting");
        int age = scanner.nextInt();

        if(age <= 18){

            System.out.println("Your age is not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
}
