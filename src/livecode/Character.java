package livecode;

public class Character {

    private String name;
    private String status;

    public Character(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void attack(Monster monster) {
        System.out.println("공격 합니다");
        monster.setStatus("bad");

    }

    public void setStatus(String mood) {
        this.status = mood;
    }

    //기분 표출
    public String getStatus() { //반환 타입 String
        return status;
    }

    // 세터 & 게터
    // 세터 : 설정해주는 놈
    // 게터 : 가지고 오는 놈
}
