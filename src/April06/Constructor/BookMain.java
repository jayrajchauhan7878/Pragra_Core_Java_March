package April06.Constructor;

import java.sql.SQLOutput;

public class BookMain {
    public static void main(String[] args) {

        System.out.println("Book 1 - ");
        Book book1 = new Book("Good great","Jim Collins",2023,"Non fiction ");
        book1.printBookname();
        book1.printAuthor();
        book1.printPubyear();
        book1.printGenre();
        book1.printPrice();

        System.out.println("Book 2 - ");
        Book book2 = new Book("Rich dad Poor dad","Robert Kiyosaki",1997,"Non fiction ");
        book2.printBookname();
        book2.printAuthor();
        book2.printPubyear();
        book2.printGenre();
        book2.printPrice();

        System.out.println("Book 3 - ");
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling",1997,"Fantasy ");
        book3.printBookname();
        book3.printAuthor();
        book3.printPubyear();
        book3.printGenre();
        book3.printPrice();


    }
}
