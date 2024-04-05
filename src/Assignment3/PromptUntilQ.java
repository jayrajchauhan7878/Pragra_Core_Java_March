package Assignment3;

import java.util.Scanner;

public class PromptUntilQ {

    // Create a Java program that uses a do-while loop to continuously prompt the user for input until they enter 'q' to quit.

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        char input = sc.next().charAt(0);*/

        Scanner scanner = new Scanner(System.in);
        String input;


        do {
            System.out.print("Enter some text : ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } while (!input.equals("q"));

        System.out.println("Quitting the program...");



      }



    }

