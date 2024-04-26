package april23.polymorphism;

public class ShapeMain {


    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(3,5);



        System.out.println("Area of Reactangle is : "+rectangle.getArea());



        Circle circle = new Circle(3);

        System.out.println("Area of the circle "+circle.getArea());




    }
}
