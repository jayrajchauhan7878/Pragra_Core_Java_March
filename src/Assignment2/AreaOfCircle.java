package Assignment2;

import java.util.Scanner;

public class AreaOfCircle {

    // write a Java program to calculate the area of circle.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of Radius");
        double r = scanner.nextDouble();
        double pie = 3.14;

        double area;

        area = pie * (r * r);

        System.out.println("Area of circle is "+ area);


    }
}
