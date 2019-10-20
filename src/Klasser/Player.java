package Klasser;

public class Player {
    private String name;
    private int money;
    private boolean win;

    public Player() {
        this.money = 1000;
    }

    public Player(String name) {
        this.name = name;
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

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int diff) {
        this.money += diff;

    }
}


