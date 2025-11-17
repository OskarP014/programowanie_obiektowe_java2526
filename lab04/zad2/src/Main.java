import books.Book;
import library.Shelf;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "Tomasz";
        book1.title = "Wieszco";
        book1.publicationYear = 2009;

        Book book2 = new Book();
        book2.author = "Michal";
        book2.title = "Coglosnokichal";
        book2.publicationYear = 2011;

        Shelf shelf = new Shelf();
        shelf.addBooks(book2);
        shelf.addBooks(book1);
        shelf.showBoooks();
        shelf.rmBooks(book1);
        shelf.showBoooks();


        }
    }
