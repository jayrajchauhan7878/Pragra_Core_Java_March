package April20.inheritance;

public class Bank {


    String accountInfo ;
    int accountNumber;

    public Bank(String accountInfo, int accountNumber) {
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }


    public void printBankDetails(){

        System.out.println("Printing bank details");
    }
}
