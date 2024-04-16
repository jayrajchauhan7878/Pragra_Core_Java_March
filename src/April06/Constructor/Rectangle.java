package April06.Constructor;

public class Rectangle {


    double length;
    double width;

    public Rectangle(double length){
        this.length = length;
    }



    public Rectangle(double length,double width){

       this.length = length;
       this.width = width;


    }




    public double calculateArea(){

        double area = length * width;
        System.out.println("Area of Rectangle is :" +area);
        return area;
    }

    public double calculatePerimeter(){

        double peri = 2 * (length + width);
        System.out.println("Perimeter of rectangle is :" +peri);
        return peri;
    }
}
