package April02;


import java.util.Scanner;

/*
* Create a class called rectangle
*
* 1. create a method to calculate are
* 2. create a method ti calculate perimeter
*
* This is with void method
* */
public class Rectangle {


    double width = 10;
    double length = 10;
    double area;
    double peri;

    public void calculateArea(){

         area = width * length;
        System.out.println("Area of circle is : "+area);


    }

    public void calculatePerimeter(){

        peri = 2 * (length + width);
        System.out.println("Perimeter of Circle is : "+peri);

    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();


    }
}
