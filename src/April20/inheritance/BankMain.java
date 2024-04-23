package April20.inheritance;

public class BankMain {


    public static void main(String[] args) {


        RBC rbc = new RBC("Savings",10011,20,2000,200);
        rbc.printRbcInfo();


        ScotiaBank scotia = new ScotiaBank("Savings",10012,20,1000,100);
        scotia.printScotiabankInfo();

        TD td = new TD("Savings",10013,30,10000,250);
        td.printTdInfo();

        BMO bmo = new BMO("Savings",10014,10,3000,350);
        bmo.printBmoInfo();

        CIBC cibc = new CIBC("Savings",10015,40,15000,450);
        cibc.printCibcInfo();
    }
}
