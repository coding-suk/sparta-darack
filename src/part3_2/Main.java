package part3_2;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book bookA = new Book("1", "l", true);
        Book bookb = new Book("s", "2", true);

        library.addBook(bookA);
        library.addBook(bookb);

        library.printAllBook();

        library.rentBook(bookA);

        library.returnBook(bookb);
    }
}
