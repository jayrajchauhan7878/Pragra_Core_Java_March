package Loops;

public class DoWhile {

    //  Print numbers from 1-10 and calculate the sum of those numbers

    public static void main(String[] args) {
        int n = 1;
        int sum = 0;


        do{

            System.out.println(n);
            sum = sum + n;
            n++;


        }while(n <= 10);

        System.out.println("Sum of 1 to 10 is : "+sum);
    }
}
