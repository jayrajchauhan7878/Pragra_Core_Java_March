package Assignment2;

import java.util.Scanner;

public class OutputMonthName {

   // Create a Java program that takes a numerical month input (1-12) and outputs the corresponding month name using a switch case

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerical number for month");
        int month = sc.nextInt();

        switch (month){

            case 1:
                System.out.println("Its Jan");
                break;
            case 2:
                System.out.println("Its Feb");
            case 3:
                System.out.println("Its Mar");
                break;
            case 4:
                System.out.println("Its Apr");
                break;
            case 5:
                System.out.println("Its May");
                break;
            case 6:
                System.out.println("Its Jun");
                break;
            case 7:
                System.out.println("Its Jul");
                break;
            case 8:
                System.out.println("Its Aug");
                break;
            case 9:
                System.out.println("Its Sep");
                break;
            case 10:
                System.out.println("Its Oct");
                break;
            case 11:
                System.out.println("Its Nov");
                break;
            case 12:
                System.out.println("Its Dec");
                break;
            default:
                System.out.println("Invalid number, Enter between 1 to 12");
        }

    }
}
