package practice;

public class Character {

    String name;
    String status;

    public Character(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String st) {
        this.status = st;
    }

    public void attack(Monster monster) {
        System.out.println("공격을 합니다");
        monster.setStatus("bad");
    }

}
