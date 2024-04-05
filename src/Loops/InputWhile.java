package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to calculate the sum");
        int n = scanner.nextInt();
        int i = 1;

        int sum =0;

        while(i <= n)
        {
            System.out.println(i);
            sum = sum + i;
            i++;

        }
        System.out.println("The sum of numbers from 1 to "+n + "is: "+ sum);
    }
}
