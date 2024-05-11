package Assignment6OOP.inheritance;

public class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){

        System.out.println("Starting....");
    }
    public void stop(){

        System.out.println("Stopping....");
    }
    public void display(){

        System.out.println("Car has Display screen");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
