public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Ironhacker");
        Book b = new Book("allo", "salvatore" , "1234567890");
        System.out.println("ISBN : " +b.idISBN  + "title :" +b.title + " - author :" + b.author);
    }
}
