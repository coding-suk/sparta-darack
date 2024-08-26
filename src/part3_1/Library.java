package part3_1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> bookArr;

    public Library() {
        bookArr = new ArrayList<>();
    }


    //책 추가
    public void addBook(Book book) {
        bookArr.add(book);
    }

    // 책 제거
    public void deleteBook(Book book) {
        bookArr.remove(book);

    }

    // 책 출력
    public void showAllBook() {
        System.out.println("모든 책 출력: ");
        for (Book books : bookArr) {
            System.out.println(books.bookNameCheck());
        }

    }

    public void borrowBook(Book book) {
        for (Book books : bookArr) {
            if (books.equals(book)) {
                System.out.println("책 대여 성공"); // 책이 대여가 됐으니까 isVailable이 true -> false가 되어야 하는데 이걸 어떻게 해야하는건지.
                break;
            } else {
                System.out.println("책은 이미 대여중입니다");
            }
        }
    }

    //책 이름으로 검색
    public String searchBook(String volumn) { // 이부분도 튜터님하고 했던거 참고하여 했기 때문에 부족
        for (Book book : bookArr) {
            if (book.bookNameCheck().equals(volumn)) {
               return "책 이름: " + volumn;
            } else {
                return "검색하신 " +volumn+"은 조회가 되지 않습니다.";
            }
        }
        return volumn;
    }
}
