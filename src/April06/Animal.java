package April06;

public class Animal {

    String color;
    double height;

    Animal(){

       color = "blue";
        System.out.println("Animal color is : "+ color);
       height = 12.0;
        System.out.println("Animal height is :"+ height);


    }

    public void walk(){

        System.out.println("Animal walks on four feet");
    }

    public void talk(){

        System.out.println("This animal cant talk ");
    }

    public void makeSound(){

        System.out.println("Animal makes sound ");
    }

    public void eat(){

        System.out.println("This animal can eat small insects ");
    }


}
