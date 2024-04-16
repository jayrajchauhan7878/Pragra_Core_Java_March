package April06.Constructor;

public class RectangleMain {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,4);
        Rectangle rectangle1 = new Rectangle(5,4);
        Rectangle rectangle2 = new Rectangle(50,12);
        Rectangle rectangle3 = new Rectangle(12,23);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();


    }
}
