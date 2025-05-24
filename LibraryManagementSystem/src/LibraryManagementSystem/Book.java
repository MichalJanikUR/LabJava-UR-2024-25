package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) throws InvalidBookException{
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidBookException {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InvalidBookException {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) throws InvalidBookException {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
