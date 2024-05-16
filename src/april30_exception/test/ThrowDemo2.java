package april30_exception.test;

import java.security.PublicKey;

public class ThrowDemo2 {

    public static void checkAge(int age){

        if (age < 18){

            throw new ArithmeticException("Not eligible for Voting");
        }else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        checkAge(7);
    }
}
