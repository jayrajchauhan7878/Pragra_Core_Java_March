package Assignment3;

import java.util.Scanner;

public class SumOfNNumbers {

    //write java program to find the sum of first 10 natural numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find sum");
        int n = sc.nextInt();
        int sum = 0;

        for( int i = 1; i <= n; i++ ){


            sum = sum + i;
            System.out.println(i);

        }System.out.println("Sum of n number is " +sum);

    }
}
