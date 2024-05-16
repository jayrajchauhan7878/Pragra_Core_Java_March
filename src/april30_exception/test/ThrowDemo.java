package april30_exception.test;

public class ThrowDemo {

    public static void checkAge(int age){


        if ( age < 18){

            throw new ArithmeticException("Access denied - You must be at least 18 years old");


        }else {

            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {
        checkAge(82);

    }
}
