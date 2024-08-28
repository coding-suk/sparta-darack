package livecode1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // 아이템 담을 수 있는 공간
    List<Item> car;  // 목록<데이터타입> 변수;
    //LIst<Item>car = new ArrayList<>() 도 가능하다.
    int total=0;

    public Inventory() {
        car = new ArrayList<>();
    }

    //아이템을 넣는 기능
    public void addItem(Item item) {
//        car.add(item);
        if(item.getWeight() + total < 10){
            car.add(item);
            total += item.getWeight();
            System.out.println(total);
        } else {
            System.out.println("무게가 넘처흐릅니다");
        }

    }

    // 아이템 목록 조회
    public void printAllItem() {
        for(Item tem : car) {
            tem.printItem();
        }
    }

    // 추가 할때 인벤토리의 무게가 10이 되면 안됀다.
    public void conditionWeight(Item item) {
        if(item.getWeight() + total < 10){
            car.add(item);
            total += item.getWeight();
        } else {
            System.out.println("무게가 넘처흐릅니다");
        }
    }

    // 추가 할때 인벤토리의 무게가 10이 되면 안됀다.
//    public void conditionWeight() {
//        for(Item item : car) {
//            if(weight < 10) {
//                weight += item.getWeight();
//            } else {
//                System.out.println("무게 초과");
//            }
//        }
//        System.out.println(weight);
//    }
    // 튜터님이 한것 addItem
    // 내부에서 관리함 totalweight
    public void addAllItem(Item item) {
        int totalweight = 0;
        for (Item i : car) {
            totalweight+= i.getWeight();
        }
        if(10 < totalweight) {
            System.out.println("담을 수 없습니다");
        } else {
            car.add(item);
            System.out.println("담을 수 있습니다");
        }
    }


}
