package April02;

/* Circle
radius
area and circumeference.
*/


public class Circle {

    double r = 10;
    double pi = 3.141592653589793238462643383279502884197;

    double area;

    public void caclulateCircum(){

        area = pi * r * r;
        System.out.println("Area of circle is :" +area);

    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.caclulateCircum();

    }



}
