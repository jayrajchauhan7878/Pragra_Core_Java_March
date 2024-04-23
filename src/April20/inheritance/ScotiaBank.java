package April20.inheritance;

public class ScotiaBank extends BankOfCanada{

    double minimumDeposit;
    double fees;

    public ScotiaBank(String accountInfo, int accountNumber, double mortgageRate, double minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printScotiabankInfo(){

        System.out.println("Printing Soctia bank info");

        System.out.println("Account info : "+accountInfo);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Mortgage Rate : "+mortgageRate);
        System.out.println("Minimum Deposit : "+minimumDeposit);
        System.out.println("Account fees : "+fees);
    }
}
