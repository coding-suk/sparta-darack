package part2.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection01 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String city = sc.nextLine();

            if (city.equals("exit")) {
                break;
            }
//            cities.add(city);

            if(!cities.contains(city)) {
                cities.add(city);
            }

        }
        if (cities.isEmpty()) {
            System.out.print("도시의 목록이 비어있습니다.");
        } else {
            System.out.println("도시의 개수 : " + cities.size());
            for (int j = cities.size()-1; j >= 0; j--) {
                System.out.println(cities.get(j));
            }
        }
    }// 중복 입력 제거

}

