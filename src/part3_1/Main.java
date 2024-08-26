package part3_1;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book bookA = new Book("1", "", true);
        Book bookB = new Book("2", "", true);
        Book bookC = new Book("3", "", true);
        Book bookD = new Book("4", "", true);

        // 책 추가
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        //제거
        library.deleteBook(bookD);

        // 모든 책 출력
        library.showAllBook();

        // 책 대여
        library.borrowBook(bookA);

        // 책 반납



    }
}
