package livecode;

public class Main {
    public static void main(String[] args) {

        // 인스턴스 화
        Character character = new Character("steve", "ok");

        character.setStatus("bad");

        // 기분 조회
        String s =character.getStatus(); // 어디에 담는다 , 받을 때도 일관적으로 String
        System.out.println("그의 기분은 " + s);


        Monster monster = new Monster("mon", "ok");

        String b = monster.presentStatus();
        character.attack(monster); // 객체간에 연관 관계 생성
        String c = monster.presentStatus();
        System.out.println("monster 전 상태: " + b);
        System.out.println("monster 후 상태: " + c);




    }
}
