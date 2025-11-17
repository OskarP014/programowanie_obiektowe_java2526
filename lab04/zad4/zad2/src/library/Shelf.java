package library;

import books.Book;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> books = new ArrayList<>();

    public void addBooks(Book book)
    {
        books.add(book);
    }

    public void rmBooks(Book book)
    {
        books.remove(book);
    }

    public void showBoooks()
    {
        for(Book book: books) {
            System.out.println("Author: " + book.author + " wrote: " + book.title + " in " + book.publicationYear);
        }
    }
}
