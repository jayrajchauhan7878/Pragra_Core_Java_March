package Loops;

public class WhileLoop {

    // Print numbers from 1-10 and calculate the sum of those numbers


    public static void main(String[] args) {

        int n = 1;
        int sum = 0;



        while (n <=10){

            System.out.println(n);
            sum = sum + n;
            n++;
        }
        System.out.println("Sum of 1 to 10 numbers"+sum);

    }
}
