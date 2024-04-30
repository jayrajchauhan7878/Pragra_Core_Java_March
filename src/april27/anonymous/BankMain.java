package april27.anonymous;

public class BankMain {


    public static void main(String[] args) {

        Bank bank = new Bank() {
            @Override
            void interest() {
                System.out.println("Rate of interest is 20%");
            }

        };
        bank.interest();
    }
}
