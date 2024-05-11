package Assignment6OOP.inheritance;

public class Car extends Vehicle {



    int Doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        Doors = doors;
    }

    public void numDoors(){

        System.out.println("Car has doors");
    }

    @Override
    public String toString() {
        return "Car{" +
                "Doors=" + Doors +
                '}';
    }
}
