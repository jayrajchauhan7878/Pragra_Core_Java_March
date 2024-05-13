package Assignment6OOP.polymorphism;

public class Employee {


   private int id;
    private String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void calculatePay(){

        double wages = 16.45 ;
        double hours = 40;
        double salary;

        salary = wages * hours;



    }
}
