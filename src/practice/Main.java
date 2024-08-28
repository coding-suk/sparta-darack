package practice;

public class Main {
    public static void main(String[] args) {

        Character character = new Character("stieve", "ok");
        Monster monster = new Monster("괴물", "ok");

        character.setStatus("bad");
        String ch1 = character.getStatus();
        System.out.println("캐릭터 상태: " + ch1);

        String mo1 = monster.getStatus();
        character.attack(monster);
        String mo2 = monster.getStatus();
        System.out.println("전 괴물: " + mo1);

        System.out.println("후 괴물: " + mo2);

    }
}
