package part2.arrangement;

import java.util.Scanner;

public class Array01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities = new String[6];

        System.out.println("광역시 6개를 차례대로 입력해주세요");
        for(int i = 0; i < cities.length; i++) {
            String city = sc.nextLine();
            cities[i] = city;
        }

        for(String city : cities) {
            System.out.println("%s 광역시" + city);
        }
    }



}
