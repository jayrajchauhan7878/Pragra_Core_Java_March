package Assignment6OOP.inheritance;

public class ElectricCar extends Car{

    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int doors, int batteryCapacity) {
        super(make, model, year, doors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargedCapacity(){

        System.out.println("Electric car capacity is");
    }
}
