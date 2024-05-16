package Assignment6OOP.interfaces;

public class Penguin implements Animal , Swimmable {


    @Override
    public void feed() {
        System.out.println("Penguin eats small Fishes");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make sound as squawking ");
    }

    @Override
    public void swim() {

        System.out.println("Penguin can swim in ocean");

    }
}
