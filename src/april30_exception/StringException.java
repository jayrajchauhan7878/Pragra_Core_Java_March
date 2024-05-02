package april30_exception;

public class StringException {

    public static void main(String[] args) {

        String s = null;




        try {
            s.toUpperCase(null);
        }
        catch (NullPointerException e){

            e.printStackTrace();
        }




        System.out.println("After string");
    }
}
