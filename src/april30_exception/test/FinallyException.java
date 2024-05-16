package april30_exception.test;

public class FinallyException {

    public static void main(String[] args) {

        try{

            int data = 100/0;
            System.out.println(data);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Try catch finished here");
        }
    }
}
