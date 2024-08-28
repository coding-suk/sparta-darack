package part3_3;

public class Main {
    public static void main(String[] args) {

        // 객체 생성
        Library library = new Library();

        // 책 객체 생성
        Book bookA = new Book("힘이 정의다", "미국", true);
        Book bookB = new Book("마법의 말", "일본", true);
        Book bookC = new Book("꿈꾸는 다락방", "한국", true);
        Book bookD = new Book("스폰지밥", "미국", true);

        // 책 추가
        library.getBook(bookA);
        library.getBook(bookB);
        library.getBook(bookC);
        library.getBook(bookD);

        // 책 제거
        library.removeBook(bookD);

        // 모든 책 출력
        library.allPrint();

        library.rentBook(bookA);

        library.returnBook(bookA);

    }
}
