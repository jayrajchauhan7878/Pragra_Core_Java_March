package april23.polymorphism;

public class Rectangle extends Shape {

    private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double getArea(){

        return l * w;
    }
}
