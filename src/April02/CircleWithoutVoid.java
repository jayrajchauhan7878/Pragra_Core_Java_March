package April02;

public class CircleWithoutVoid {

    public double calculateCircle( double pi, double r){

        double area = pi * r * r ;
        System.out.println("Area of circl: " + area);
        return area;
    }

    public static void main(String[] args) {

        CircleWithoutVoid circleWithoutVoid = new CircleWithoutVoid();
        circleWithoutVoid.calculateCircle(3.141592653589793238462643383279502884197,10);
    }
}
