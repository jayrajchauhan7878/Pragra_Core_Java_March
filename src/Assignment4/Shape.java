package Assignment4;


import java.util.Scanner;

public class Shape {

   /* public static double calculateArea(double radius) {

        return Math.PI * radius * radius;

    }*/

    public static double calculateArea(double radius){

            return Math.PI * radius * radius;

    }
    public static int calculateArea(int sidelength){

        return sidelength * sidelength;
    }

    public static double calculateArea(double length , double width){

        return length * width;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Area to calculate");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Exit......");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter value of Radius");
                    double radius  = scanner.nextDouble();

                    System.out.println("Area of Circle is : "+ calculateArea(radius));
                    break;
                case 2:
                    System.out.println("Enter Value of SideLength for Square");
                    int sidelength = scanner.nextInt();

                    System.out.println("Area of square is :"+ calculateArea(sidelength));
                    break;
                case 3:
                    System.out.println("Enter value of Lenght for rectangle");
                    double length = scanner.nextDouble();

                    System.out.println("Enter value of width for rectangle");
                    double width = scanner.nextDouble();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid option please try again");


            }


        }while (choice != 4);
    }
}
