package Assignment6OOP.polymorphism;

public class EmployeeMain {


    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101,"Mohan");
        fullTimeEmployee.calculatePay();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(201,"John");
        partTimeEmployee.calculatePay();
    }
}
