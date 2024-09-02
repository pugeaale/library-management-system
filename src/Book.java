//Create a Book class with properties like title, author, and ISBN.
public class Book {

    private String title;
    private String author;
    private String idISBN;

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    private boolean isBorrowed;

    public Book(String title, String author, String idISBN) {
        setTitle(title);
        setAuthor(author);
        setIdISBN(idISBN);
        setBorrowed(false);
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
