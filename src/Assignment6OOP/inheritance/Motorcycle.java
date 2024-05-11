package Assignment6OOP.inheritance;

public class Motorcycle extends Vehicle {


    int cyclinder;

    public Motorcycle(String make, String model, int year, int cyclinder) {
        super(make, model, year);
        this.cyclinder = cyclinder;
    }

    public void numCyclinder(){

        System.out.println("Motorcycle has cylinder");
    }
}
