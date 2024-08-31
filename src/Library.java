import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("One book added to the library");
    }

    public void removeBook(Book b) {
        books.remove(b);
        System.out.println("One book removed from the library");
    }

    public void displayBooks() {
        System.out.println(" Library List of books");
        for( Book b : books) {
            System.out.println("ISBN : " +b.idISBN  + " - title :" +b.title + " - author :" + b.author);
        }
    }

    public List<Book> searchBooks(String[] arg) {
        List<Book> bobok = new ArrayList<>();
        for(String s : arg) {
            for( Book b : books) {
                if (b.title.equals(s) || b.author.equals(s)) bobok.add(b);
            }
        }
        return bobok;
    }
}
