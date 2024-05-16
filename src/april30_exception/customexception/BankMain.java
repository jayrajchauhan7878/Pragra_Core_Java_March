package april30_exception.customexception;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        double balance = bank.getBalance();
        System.out.println("Current Balance ="+balance);

        double deposited = bank.depositAmount(5000);
        System.out.println("Deposited Amount = "+deposited);

        double withdrawn = bank.withdrawAmount(75500);
        System.out.println("Withdrawn Amount = "+withdrawn);

    }

}
