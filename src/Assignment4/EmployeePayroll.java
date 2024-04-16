package Assignment4;

import java.util.Scanner;

public class EmployeePayroll {
/*
    Create an EmployeePayroll class with properties like employeeId, employeeName, basicSalary, and designation.
    Write a constructor to initialize these properties when instantiating an EmployeePayroll object.
    Implement methods to calculate the gross salary, deductions, and net salary.
*/



    double employeeId;
    String employeeName;
    double basicSalary;
    String designation;

    Scanner scanner = new Scanner(System.in);
    public EmployeePayroll(double employeeId, String employeeName, double basicSalary , String designation){

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    public double grossSalary (){

        double allowance = 0.25 * basicSalary;
        return basicSalary + allowance ;

        }
    public double deduction (){

        return grossSalary() *0.30;
    }

    public double netSalary (){

        return  grossSalary() - deduction();
    }

    public String toString() {
        return "EmployeePayroll -" +
                "Name='" + employeeName + '\'' +
                ", Id=" + employeeId +
                ", Designation='" + designation + '\'' +
                ", Basic Salary=$" + basicSalary +
                '}';
    }
    public static void main(String[] args) {

        EmployeePayroll emp = new EmployeePayroll(01,"Rohit Patel",10000,"Devloper");
        System.out.println(emp);
        System.out.println("Gross salary is "+ emp.grossSalary());
        System.out.println("Deductions is "+ emp.deduction());
        System.out.println("Net salary is " + emp.netSalary());
    }


    }





