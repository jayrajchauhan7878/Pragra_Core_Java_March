package april23.polymorphism;

public class Circle extends Shape {

    private double r ;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea(){

        return Math.PI * r * r;
    }
}
