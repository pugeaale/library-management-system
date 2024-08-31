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
    }
}
