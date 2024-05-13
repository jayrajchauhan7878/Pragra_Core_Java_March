package Assignment6OOP.polymorphism;

public class Employee {


    int id;
    String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void calculatePay(){

        double wages = 16.45 ;
        double hours = 40;
        double salary;

        salary = wages * hours;



    }
}
