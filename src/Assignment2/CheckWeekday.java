package Assignment2;

import java.util.Scanner;

public class CheckWeekday {


    //Implement a Java program that takes a day of the week as input and outputs whether it's a weekday or a weekend using a switch case

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        String day = scanner.next();

        switch (day.toLowerCase()){

            case "monday":
                System.out.println("Its weekday !!!");
                break;
            case "tuesday":
                System.out.println("It's weekday !!!");
                break;
            case "wednesday":
                System.out.println("It's weekday!!");
                break;
            case "thursday":
                System.out.println("It's weekday!!");
                break;
            case "friday":
                System.out.println("It's weekday!!");
                break;
            case "saturday":
                System.out.println("Horray ! It's weekend");
                break;
            case "sunday":
                System.out.println("Horray ! Its weekend");
            default:
                System.out.println("Invalid entry please check again..");
        }scanner.close();

    }
}
