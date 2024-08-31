import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Ironhacker");
        Book b = new Book("allo", "salvatore" , "1234567890");
        Library l = new Library();
        l.addBook(b);
        l.displayBooks();
        Book bb = new Book("tchao", "angelo" , "0987654321");
        l.addBook(bb);
        l.displayBooks();
        l.removeBook(b);
        l.displayBooks();
        Book bbb = new Book("ola", "angela" , "111222333");
        l.addBook(bbb);
        String[] ss = {"angela"};
        List<Book> li = l.searchBooks(ss);
        if( li.isEmpty()) {
            System.out.println("no book found");
        } else {
            System.out.println(li.size() + " matches");
            for(Book bbbb : li) {
                System.out.println(bbbb.idISBN + " - " + bbbb.author + " - " + bbbb.title);
            }
        }
        String[] sss = {"angelus"};
        List<Book> lii = l.searchBooks(sss);
        if( lii.isEmpty()) {
            System.out.println("no book found");
        } else {
            System.out.println(lii.size() + " matches");
            for(Book bbobb : lii) {
                System.out.println(bbobb.idISBN + " - " + bbobb.author + " - " + bbobb.title);
            }
        }

        String[] ssss = {"angela", "angelus", "tchao"};
        List<Book> liix = l.searchBooks(ssss);
        if( liix.isEmpty()) {
            System.out.println("no book found");
        } else {
            System.out.println(liix.size() + " matches");
            for(Book bbbobb : liix) {
                System.out.println(bbbobb.idISBN + " - " + bbbobb.author + " - " + bbbobb.title);
            }
        }

    }
}
