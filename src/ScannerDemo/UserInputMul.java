package ScannerDemo;

import java.util.Scanner;

public class UserInputMul {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for X:");
        int x = scanner.nextInt();

        System.out.println("Enter value of y:");
        int y = scanner.nextInt();

        int mul = x * y;

        System.out.println("Multiplication of X and y is :"+mul);
    }
}
