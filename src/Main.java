

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Ironhacker");
        Book book1 = new Book("allo", "salvatore" , "1234567890");
        Library library1 = new Library();
        library1.addBook(book1);
        library1.displayBooks();

        Book book2 = new Book("tchao", "angelo" , "0987654321");
        library1.addBook(book2);
        library1.displayBooks();
        library1.removeBook(book1);
        library1.displayBooks();

        Book book3 = new Book("ola", "angela" , "111222333");
        library1.addBook(book3);

        String[] args1 = {"angela"};
        library1.searchBooks(args1);

        String[] args2 = {"angelus"};
        library1.searchBooks(args2);


        String[] args3 = {"angela", "angelus", "tchao"};
        library1.searchBooks(args3);


    }
}
