package part3_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book s) { // 책을 추가 (예상 set의 계녕)
        books.searchBook(s);
        //Book 클래스의 searchBook 메서드를 갖고 와서 return 시켜줘야 하지 않나??
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
