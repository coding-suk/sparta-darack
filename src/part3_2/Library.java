package part3_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book s) { // 책을 추가 (예상 set의 계녕)
        books.add(s);
        //Book 클래스의 searchBook 메서드를 갖고 와서 return 시켜줘야 하지 않나??
    }

    // 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    //책 이름으로 검색
    public Book searchBookName(Book volumn) {
        for(Book bo : books) {
            if(bo.equals(volumn.getTitle())) {
                volumn.detailImfor();
                return bo;
            }
        }
        return null;
    }

    // 모든 책 조회
    public void printAllBook() {
        for(Book book : books) {
            book.detailImfor();
        }

    }

    //첵 대여
    public Book rentBook(Book title) {

        for(Book bo : books) {
            if(title.equals(bo.getTitle())){
                bo.setIsAvailable(false);
                return bo;
            } else {
                System.out.println("대여불가");
                return null;
            }
        }
//        // 책을 객체로 가져와야한다.
//        if(volumn.getIsAvailable()) {
//            volumn.setIsAvailable(false);
//            System.out.println("대여 완료");
//        } else {
//            System.out.println("대여중 / 대여 불가");
//        }
        return null;
    }

    // 책 반납
    public void returnBook(Book volumn) {
        if (!volumn.getIsAvailable()){
            volumn.setIsAvailable(true);
            System.out.println("반납 완료");
        } else {
            System.out.println("반납 안됌");
        }
    }
}
