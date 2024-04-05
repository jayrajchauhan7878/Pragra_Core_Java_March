package ScannerDemo;

import java.util.Scanner;

public class UserInputSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter value of X");
        int x = scanner.nextInt(); // Input from user


        System.out.println("Enter value of Y");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println("Sum of X and Y is "+sum);

    }
}
