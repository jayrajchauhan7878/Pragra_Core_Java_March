package april23;

public class ShapeMain {


    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(3,5);

        double areaOfReact = rectangle.getArea();

        System.out.println("Area of rectangle is :"+areaOfReact);

        Circle circle = new Circle(3);

        double areaOfCircle = circle.getArea();

        System.out.println("Area of circle is : "+areaOfCircle);



    }
}
