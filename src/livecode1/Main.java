package livecode1;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // 객체 생성
        Item item1 = new Item("콜벳", 8);
        Item item2 = new Item("카마로", 4);
        Item item3 = new Item("닷지", 2);

        // 객체 출력 기능
        item1.printItem();
        item2.printItem();
        item3.printItem();

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        inventory.printAllItem();

//        inventory.conditionWeight(item1);
//        inventory.conditionWeight(item2);
//        inventory.conditionWeight(item3);



    }
}
