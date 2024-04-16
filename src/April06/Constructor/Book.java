package April06.Constructor;

public class Book {

    String author;
    int pubyear;
    String genre;
    String bookname;
    double price;

    Book(String bookname,String author,int pubyear, String genre){

        this.bookname = bookname;
        this.author = author;
        this.pubyear = pubyear;
        this.genre = genre;


    }

    Book(double price){

        price = 99.99;
    }

    public void printBookname(){

        System.out.println("Book Name : " + bookname );
    }

    public void printAuthor(){

        System.out.println("Author Name : "+ author);

    }

    public void printPubyear(){

        System.out.println("Publication Year : "+ pubyear);
    }

    public void printGenre(){

        System.out.println("Genre : "+ genre);
    }

    public void printPrice(){

        System.out.println("Book Price : "+ price);
    }


}
