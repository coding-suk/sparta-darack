package part2.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> cities = new HashMap<>();
        String input;

        System.out.println("도시와 소재지를 차례로 입력합니다");
        while (true) {
            input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }
            String[] separatedInput = input.split(" ");

            if (!cities.containsKey(separatedInput[0])) {
                cities.put(separatedInput[0], separatedInput[1]);
            }
//            cities.putIfAbsent(separatedInput[0], separatedInput[1]) 심화
        }
        for (String city : cities.keySet()) {
            System.out.println(city + "은(는)" + cities.get(city) + "에 있습니다");
        }

    }
}
