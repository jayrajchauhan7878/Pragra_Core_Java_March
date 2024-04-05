package Loops;

import java.util.Scanner;

public class LotteryForLoop {

    /*Lottery System
    You ask user to enter a number  1-100   ,    55- Lucky Number
1.   10 -- Sorry , Try again
2. 20 --- Sorry Try again
3. 55 -- You won $50000.

three times not winner try again , hard luck by another lottery*/

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lottery");
        System.out.println("Enter number you want to try");
        int number = scanner.nextInt();


        if(number == 55){

                System.out.println("You won $5000");

            }else {

                System.out.println("Sorry Try again");
            }
        }


    }

