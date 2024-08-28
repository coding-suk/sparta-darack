package part3_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookArr;

    public Library() {
        bookArr = new ArrayList<>();
    }

    // 책 추가
    public void getBook(Book book) {
        bookArr.add(book);
        System.out.println("책이 추가되었습니다");
    }

    // 책 제거
    public void removeBook(Book book) {
        bookArr.remove(book);
        System.out.println("책이 제거되었습니다.");
    }

    // 책 이름으로 검색
    public Book searchBook(Book book) {
        for(Book books : bookArr) {
            if (books.equals(book.getTitle())) {
                book.detailInfor();
                return books;  // 반환타입? get와 set과 연관관계가 있는거 같은데
            } else {
                System.out.println("찾으시는 책은 없습니다");
            }
        }
        return null;
    }

    // 모든 책 조회
    public void allPrint() { // 입력 메서드에 값을 넣어줄 필요가 없기 때문
        for(Book books : bookArr) {
            books.detailInfor();
        }
    }

    // 밑으로 수정 필요
    // 책 대여
    public Book rentBook(Book book) {
        for(Book books : bookArr) {
            if (books.equals(book.getTitle())) {
                System.out.println("대여가 되었습니다");
                book.setIsAvailable(false);
                return books;
            } else {
                System.out.println("대여가 실패했습니다");
            }
        }
        return null;
    }

    // 책 반납
    public void returnBook(Book book) {
        if(!book.getIsAvailable()) { //?
            System.out.println("책 반납 실패");
        } else {
            System.out.println("책 반납 성공");
        }
    }

}
