package April20.inheritance;

public class BankOfCanada extends Bank {


    double mortgageRate;

    public BankOfCanada(String accountInfo, int accountNumber, double mortgageRate) {
        super(accountInfo, accountNumber);
        this.mortgageRate = mortgageRate;
    }

    public void printMortagageRate(){

        System.out.println("Printing out mortage rate");
    }


}
