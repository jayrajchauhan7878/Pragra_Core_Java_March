package ScannerDemo;

import java.util.Scanner;

public class UserInputDiv {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valud of X :");
        double x = scanner.nextDouble();


        System.out.println("Enter value of Y: ");
        double y = scanner.nextDouble();

        double div = x / y;

        System.out.println("Divison of X and y is :"+div);
    }
}
