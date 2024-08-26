package part2.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> cities = new HashSet<>();
        String city;

        System.out.println("도시를 입력하세요 ");
        while (true) {
            city = sc.nextLine();
            if (city.equals("exit")) {
                break;
            }
            cities.add(city);
//            if(city.equals("평양")) {
//                cities.remove("평양");
//            }

        }
//        for (String citys : cities) {
//            System.out.println(citys);
//        }
//        System.out.println(cities.toString());
        if (cities.contains("평양")) {
            cities.remove("평양");
        }
        if (cities.isEmpty()) {
            System.out.println("도시 목록이 비어있습니다.");
        } else {
            System.out.println("도시의 개수: " + cities.size());
//            for(String citys : cities) {
//                System.out.println(citys);
//            }
            System.out.println(cities.toString());
        }
    }
}
// 반복문안에서 밖에서 제거
