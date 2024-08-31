//Create a Book class with properties like title, author, and ISBN.
public class Book {

    private String title;
    private String author;
    private String idISBN;

    public Book(String title, String author, String idISBN) {
        setTitle(title);
        setAuthor(author);
        setIdISBN(idISBN);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIdISBN() {
        return idISBN;
    }

    public void setIdISBN(String idISBN) {
        this.idISBN = idISBN;
    }
}
