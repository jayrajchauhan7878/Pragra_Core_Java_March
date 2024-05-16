package april30_exception.test;

public class ThrowsDemo {

    public static void checkAge(int age) throws ArithmeticException{

        if ( age < 18){

            throw new ArithmeticException("You are not eligible for voting");
        }else {
            System.out.println("Can Vote");
        }
    }

    public static void main(String[] args) {
        checkAge(40);
    }
}
