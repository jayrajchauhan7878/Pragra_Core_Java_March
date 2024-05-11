package april30_exception;

public class StringExceptionHandling {

    public static void main(String[] args) {
        String s = null;

        try {

            String upperCase = s.toUpperCase();
            System.out.println(upperCase);
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e);
        }
        catch (Exception e){
            e.printStackTrace();
        }



        System.out.println("End of program");

    }
}
