package Assignment6OOP.polymorphism;

public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(int id, String name) {
        super(id, name);
    }

    double wage = 16.45;
    double hours = 40;

    double pay = 0;

    @Override
    public void calculatePay() {
        pay = wage * hours ;

        System.out.println("Fulltime Employee Pay is --"+pay);
    }
}
