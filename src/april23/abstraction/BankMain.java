package april23.abstraction;

public class BankMain {

    public static void main(String[] args) {


        BankOfCanada scotiaBank = new ScotiaBank();

        System.out.println("Scotia Bank Interest "+scotiaBank.getRateOfInterest());

        BankOfCanada rbc = new RBC();

        System.out.println("RBC Bank interest is "+rbc.getRateOfInterest());

        BankOfCanada bmo = new BMO();

        System.out.println("BMO interest is "+bmo.getRateOfInterest());

    }
}
