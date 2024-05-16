package april30_exception.test;

public class TryCatchException {


    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try{

            int sum = x / y ;

        }
        catch (ArithmeticException e) {
            System.out.println("X cant be dived by Y ");
        }
        catch (Exception e){
                System.out.println(e);;
        }
        System.out.println("End of code");
    }

}
