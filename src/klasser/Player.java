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

    //Sørger for at kontoen ikke går i minus, hvis det ikke gør udføres transaktionen, hvis det går i minus bliver pengene sat til 0
    public void addMoney(int diff) {
        if (this.money + diff >= 0) {
            this.money += diff;
            System.out.println("Transaction successful");
        } else {
            this.money = 0;
            System.out.println("Error negative funds. Money set to 0");
        }
    }
}



