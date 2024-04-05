package Assignment2;

import java.util.Scanner;

public class AreaOfSquare {

    // write a Java program to find the area of square

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("To find area of square enter number : ");
        double sq = scanner.nextDouble();

        double area = sq * sq ;
        System.out.println("Area of square is : "+ area);
    }
}
