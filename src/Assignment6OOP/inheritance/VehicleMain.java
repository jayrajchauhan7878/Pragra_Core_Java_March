package Assignment6OOP.inheritance;

public class VehicleMain {

    public static void main(String[] args) {

        Car car = new Car("Honda","CR-V",2020,4);
        Motorcycle motorcycle = new Motorcycle("Yamaha","Spliter",2023,2);
        ElectricCar electricCar = new ElectricCar("Toyota","Prius",2024,2,34000);

        System.out.println("Car Information--");
        car.display();
        car.start();
        car.stop();
        car.numDoors();
        System.out.println();
        System.out.println("MotorCycle information");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.numCyclinder();
        System.out.println();
        System.out.println("Electric Car Information");
        electricCar.start();
        electricCar.stop();
        electricCar.chargedCapacity();
        electricCar.numDoors();

    }
}
