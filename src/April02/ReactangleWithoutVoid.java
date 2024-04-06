package April02;

public class ReactangleWithoutVoid {


    public double calculateArea( double length , double width){

        double area = length * width;
        System.out.println("Area of rectangle is :"+area);
        return area;
    }

    public double calculatePeri( double length , double width){

        double peri = 2 * (length + width);
        System.out.println("Perimeter of rectangle is :"+peri);
        return peri;
    }

    public static void main(String[] args) {

        ReactangleWithoutVoid reactangleWithoutVoid = new ReactangleWithoutVoid();
        reactangleWithoutVoid.calculateArea(10,10);
        reactangleWithoutVoid.calculatePeri(10,10);

    }

}
