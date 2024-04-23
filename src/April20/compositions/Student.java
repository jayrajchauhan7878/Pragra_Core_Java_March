package April20.compositions;

public class Student {


    String name;
    int id;
    int stuClass;

    StudentAddress address;

    public Student(String name, int id, int stuClass, StudentAddress address) {
        this.name = name;
        this.id = id;
        this.stuClass = stuClass;
        this.address = address;
    }

    public void printStudentDetails(){

        System.out.println("Student Name : "+name);
        System.out.println("Student ID : "+id);
        System.out.println("Student Class in school "+stuClass);
        System.out.println("Student address "+address);
    }

}
