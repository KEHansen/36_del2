package klasser;

public class Player {
    private String name;
    private int money;

    public Player() {
        this.money = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int diff) {
        this.money += diff;
    }
}


