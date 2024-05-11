package may07;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {

        List<EmployeeDemo> employeeLists = new ArrayList<>();

        employeeLists.add(new EmployeeDemo("Jay","jayraj@example.com",25,"Canada"));
        employeeLists.add(new EmployeeDemo("Ray","ray@example.com",28,"Canada"));
        employeeLists.add(new EmployeeDemo("May","may@example.com",30,"Canada"));
        employeeLists.add(new EmployeeDemo("Mike","Mike@example.com",35,"Canada"));
        employeeLists.add(new EmployeeDemo("John","JOhnexample.com",45,"Canada"));

        for (int i = 0; i < employeeLists.size(); i++) {

            System.out.println(employeeLists.get(i));

        }

        System.out.println();
        // 1. All the employee with age greater than 35

        /*for (int i = 0; i < employeeLists.size(); i++) {

            if (EmployeeDemo.getAge()){

                System.out.println(employeeLists);
            }*/


        for (int i = 0; i < employeeLists.size(); i++) {
            EmployeeDemo employee = employeeLists.get(i);
            if (employee.getAge() >= 28) {
                System.out.println(employee.getName());
            }
        }

        System.out.println();
            for(EmployeeDemo emp : employeeLists){

                if(emp.getAge() >= 30){

                    System.out.println(emp.getEmail());
                }

        }

    }
}
