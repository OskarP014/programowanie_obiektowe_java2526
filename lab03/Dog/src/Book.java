public class Book {
    public String title;
    public String author;
    public Integer publicationYear;

    public Book(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public Book() {
        title = "Nieznany";
        author = "Anonim";
        publicationYear = 0;
    }
}
