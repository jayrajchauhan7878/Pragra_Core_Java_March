package Assignment3;

public class FactorialWhileLoop {

    public static void main(String[] args) {


        long n = 1 ;
        long fact = 1;
        long i = 1;

        while( n <= 10 ){

            fact = fact * n  ;
            n++;

        } System.out.println("Factorial for 5 is "+fact);
    }
}
