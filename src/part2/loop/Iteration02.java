package part2.loop;

public class Iteration02 {
    public static void main(String[] args) {
        String[] cities = {"인천", "부산", "울산", "광주", "대전", "대구"};

//        for (int i = 0; i < cities.length; i++) {
//            System.out.println("광역시 : " + cities[i]);
//        } // 향상된 for문
        for (String city : cities) {
            System.out.println("광력시 : " + city);
        }
    }
}
