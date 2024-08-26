package part2.loop;

public class Iteration03 {
    public static void main(String[] args) {

//        double day = Math.random();
        int overworkDays = 0;

        while (Math.random() < 0.8) {

            overworkDays += 1;

            if (overworkDays == 10) {
                break;
            }
        }
        System.out.printf("보셨나요? 저의 %d일 연속 야근!", overworkDays);
    }
}
