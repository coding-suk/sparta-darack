package part3;

public class Book {

    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 클래스 생성자는 객체를 생성할 때 호출되는 특별한 메서드입니다. 주로 다음과 같은 역할을 합니다:
    // 1. **객체 초기화**: 생성자는 객체의 속성을 초기화하는 데 사용됩니다.
    // 2. **메서드 오버로딩**: 동일한 이름의 생성자를 여러 개 정의하여 다양한 방법으로 객체를 생성할 수 있습니다.
    // 예시: ```java class Car { String model; // 생성자 Car(String model) { this.model = model; } }
    // 객체 생성 Car myCar = new Car("Tesla"); ``` 여기서 `Car` 클래스의 생성자는 `model` 속성을 초기화합니다. 추가 질문이 있으면 말씀해 주세요!

    public String getBookName() {

        return title;
    }

    public boolean getIsAvilable() {
        return true;
    }

    public void setIsAvilable(boolean avilable) {
        isAvailable = avilable;
    }

    public void details(){
        System.out.println();
    }
}


