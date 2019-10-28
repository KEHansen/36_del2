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

    public void setMoney(int money) {
        this.money = money;
    }


    public void addMoney(int diff) {
        //Sørger for at kontoen ikke går i minus
        if (this.money + diff >= 0) {
            this.money += diff;
        } else {
            this.money = 0;
        }
    }
}



