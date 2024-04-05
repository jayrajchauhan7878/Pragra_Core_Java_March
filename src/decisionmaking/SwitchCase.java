package decisionmaking;

import java.util.Scanner;

public class SwitchCase {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();

        switch (input){

            case 1:
                System.out.println("It switch on fan");

                break;
            case 2:
                System.out.println("It switch on Red bulb");
                break;
            case 3:
                System.out.println("It switch on green bulb");
                break;
            default:
                System.out.println("Nothing found please check your input");
        }

    }
}
