package may04_generics;

public class Vehicle < B , P , Y >{



    B brand;
    P price;
    Y year ;

    public Vehicle(B brand, P price, Y year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand=" + brand +
                ", price=" + price +
                ", Year=" + year +
                '}';
    }
}


 class Main{

    public static void main(String[] args) {

        Vehicle<String , Double , Integer> vehicle = new Vehicle<String,Double,Integer>("Honda",3000.00,1990);

        System.out.println(vehicle);

        Vehicle<String , Double , Integer> vehicle1 = new Vehicle<String,Double,Integer>("Kia",2000.00,2023);
        System.out.println(vehicle1);

    }
}