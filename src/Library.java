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
            System.out.println("ISBN : " +b.getIdISBN()  + " - title :" +b.getTitle() + " - author :" + b.getAuthor());
        }
    }

    public void searchBooks(String[] arg) {
        List<Book> bobok = new ArrayList<>();
        for(String s : arg) {
            for( Book b : books) {
                if (b.getTitle().equals(s) || b.getAuthor().equals(s)) bobok.add(b);
            }
        }
        if( bobok.isEmpty()) {
            System.out.println("no book found");
        } else {
            System.out.println(bobok.size() + " matches");
            for(Book bbbobb : bobok) {
                System.out.println(bbbobb.getIdISBN() + " - " + bbbobb.getAuthor() + " - " + bbbobb.getTitle());
            }
        }
    }
}
