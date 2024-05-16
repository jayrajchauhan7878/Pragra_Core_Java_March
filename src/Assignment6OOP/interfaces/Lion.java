package Assignment6OOP.interfaces;

import java.sql.SQLOutput;

public class Lion implements Animal{

    @Override
    public void feed() {
        System.out.println("Lion eates other Animal");
    }

    @Override
    public void makeSound() {

        System.out.println("Lion Roaring...");

    }
}
