package Assignment3;

import java.util.Scanner;

public class Producttable {

    //write product table of a give number in specific format e.g. 5 * 1 = 5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate multiplication table");
        int n = sc.nextInt();
        int mul = 1;
        int i;

        for(i = 1 ; i <= 10; i++){

            mul = i * n;
            System.out.println(n+" X " + i + "= "+ mul);
        }



    }

}
