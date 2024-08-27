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

    public String bookNameCheck() { // 책 제목 조회

        return title;
    }

    public boolean borrowBook() {

        return true;
    }

    public boolean getisAvailable() {

        return isAvailable;
    }

    public void setIsAvailable(boolean a) { // 설정
        this.isAvailable = a;

    }



}
