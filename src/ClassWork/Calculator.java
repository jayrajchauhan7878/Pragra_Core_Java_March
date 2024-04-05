package ClassWork;

import decisionmaking.SwitchCase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char choice;
        do {

            System.out.println("Welcome to my Calculator");
            System.out.println("1. Press 1 for addition");
            System.out.println("2. Press 2 for Multiplication");
            System.out.println("3. Press 3 for Divison");
            System.out.println("4. Press 4 for Modulus");
            System.out.println("0 for exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your input: ");
            int input = scanner.nextInt();

            System.out.println("Enter value of first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter value of second number: ");
            double num2 = scanner.nextDouble();

            switch (input) {

                case 1:

                    System.out.println("Sum of First and Second is : " + (num1 + num2));

                    break;
                case 2:
                    System.out.println("Multiplication of First and second is :" + (num1 * num2));
                    break;
                case 3:
                    System.out.println("Division of First and second is: " + (num1 / num2));
                    break;
                case 4:

                    System.out.println("Modulus of first and second number is " + (num1 % num2));
                    break;
                default:


            }

            System.out.println("Do you still want to continue? Press 'Y' = yes, Press 'N' for no");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Exiting Calculator");
    }
}
