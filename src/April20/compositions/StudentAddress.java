package April20.compositions;

public class StudentAddress {

    String street;
    String city;
    String country;
    String postalCode;

    public StudentAddress(String street, String city, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return  street + ","  + "," +
                 city +  "," +
                country + "," +
                postalCode
                ;
    }

    /*public void address(){

        System.out.println(street);
        System.out.println(city);
        System.out.println(country);
        System.out.println(postalCode);
    }*/
}
