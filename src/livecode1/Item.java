package livecode1;

public class Item {

    private String name;
    private int weight;


    //생성자
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    // 이름 조회 
    public String getName() {
        return name;
    }

    // 무게 조회
    public int getWeight() {
        return weight;
    }

    //  출력 기능
    public void printItem() {
        System.out.println("차 이름은: " + name + " 무게는: " + weight);
    }





}
