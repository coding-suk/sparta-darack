package livecode;

public class Monster {

    private String name;
    private String status;

    public Monster(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void setStatus(String mood) {
        this.status = mood;
    }

    public String presentStatus() {
        return status;
    }
}
