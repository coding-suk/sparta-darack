package part3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<Book> bookArr;

    public Library() {
        bookArr = new ArrayList<>();
    }

    public void addBook(Book book) { // 책 추가
        bookArr.add(book);
        System.out.println("도서관에 책을 추가 했습니다.");
    }

    public void removeBook(Book book) {
        bookArr.remove(book);
        System.out.println("책이 제거 되었습니다.");
    }

    public void allprinting() { // 책 출력
        System.out.println("모든 책을 출력: ");
        for (Book b : bookArr) {
            System.out.print(b.getBookName());
        }
    }

    public String searchbook(String s) { //  책 이름 검색
        for (Book b : bookArr) {
            if (b.getBookName().equals(s)) {
                System.out.println("책 이름은: " + s);
                return s;
            }
        }
        return s;
    }


    public void bookcheck() { // 책 대여

    }
}
