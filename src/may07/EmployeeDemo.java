package may07;

public class EmployeeDemo  {



    private String name;
    private String email;
    private Integer age;
    private String country;

    public EmployeeDemo(String name, String email, Integer age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}

