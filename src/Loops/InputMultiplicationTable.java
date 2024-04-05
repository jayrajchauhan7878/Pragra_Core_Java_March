package Loops;

import java.util.Scanner;

public class InputMultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        int i = 1;
        int mul;

        System.out.println("Multiplication table of " + n + " as follows");

        do {
            mul = i * n;
            System.out.println(n + " X " + i + " = "+ mul);
            i++;

        }while(i <= 10);

        /*while(i <= 10){

            mul = i * n;
            System.out.println(n + "X"+ i + " = " + mul);
            i++;*/


    }
}
