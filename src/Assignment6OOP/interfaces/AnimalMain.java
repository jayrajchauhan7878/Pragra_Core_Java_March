package Assignment6OOP.interfaces;

public class AnimalMain {

    public static void main(String[] args) {


        System.out.println("Information of lion ");
        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();

        System.out.println("================");
        System.out.println("Information of Penguin");
        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        System.out.println("================");
        System.out.println("Information of Monkey");
        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
    }

}
