package Assignment6OOP.interfaces;

public class Monkey implements Animal , Climbable{


    @Override
    public void feed() {
        System.out.println("Monkey easts Banana");
    }

    @Override
    public void makeSound() {

        System.out.println("Monkey make sound as scream");

    }

    @Override
    public void climb() {

        System.out.println("Monkey can climb a tree");
    }
}
