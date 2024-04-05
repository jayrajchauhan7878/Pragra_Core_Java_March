package Loops;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputDoWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of number");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        do{

            System.out.println(i);
            sum = sum + i;
            i++;
        }while(i <= n);

        System.out.println("The sum of numbers from 1 to "+n + "is: "+ sum);
    }


}
