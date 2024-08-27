package part3_2;

public class Book {

    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() { // 책 제목 조회
        return title;
    }

    public boolean getIsAvailable() { // 대여여부 조회
        return isAvailable;
    }

    public void setIsAvailable(boolean avilable) { // 대여여부 설정
        this.isAvailable = avilable;   // set부분은 왜 return이 없으며 반환 타입도 없는건가
        // set은 필드에 변경할 값을 전달 받아서 필드 값을 변경하는 메소드.
    }

    public void detailImfor() { // 상세 정보 출력 (출력 메소드 -> print)
        // 위의 변수 값을 갖고 와서 출력을 해야하는 건지,,
        // 매개 변수를 선언해서 받아서 출력을 해야하는가,, x
        System.out.println("책의 제목 " + title + "  책의 저자: " + author );
        //
    }

}
