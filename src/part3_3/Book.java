package part3_3;

public class Book {

    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 제목 조회
    public String getTitle() {
        return title;
    }

    //대여 여부 조회
    public boolean getIsAvailable() {
        return isAvailable;
    }

    //대여 여부 설정
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //상세 정보 출력
    public void detailInfor() {
        System.out.println("책 제목: " + title + "책의 저자: " + author);
    }

}
