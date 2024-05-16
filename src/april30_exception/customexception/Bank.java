package april30_exception.customexception;

public class Bank {

    double balance = 1000;

    public double getBalance() {
        return balance;
    }

    public double depositAmount(double depositAmount){

        return balance = balance + depositAmount;


    }

    public double withdrawAmount(double withdrawAmount){

        if ( withdrawAmount > balance){

            throw new InsufficientBalanceException("Insufficient Balance Exception");
        }
        return balance = balance - withdrawAmount;
    }
}
