package part3_1;

public class Book {

    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String bookNameCheck() {

        return title;
    }

    public boolean borrowBook() {

        return true;
    }





}
