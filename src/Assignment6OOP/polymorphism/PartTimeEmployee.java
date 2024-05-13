package Assignment6OOP.polymorphism;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int id, String name) {
        super(id, name);
    }


    @Override
    public void calculatePay() {

        double wage = 16.45;
        double hours = 20;
        double pay ;

        pay = wage * hours;

        System.out.println("Parttime Employe pay is -- "+pay);
    }
}
