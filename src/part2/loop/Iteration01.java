package part2.loop;

public class   Iteration01 {
    public static void main(String[] args) {
        int n = (int) ((Math.random() * 98) + 3);

        System.out.println("%d까지 3, 6, 9 게임 연습 시작\n");

        for (int i = 1; i < n; i++) {

            if (i % 10 == 0) {
                continue;
            }
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.println("짝");
                continue;
            }

            System.out.println(i);
        }
    }
}
// 3의 배수가 나옴

