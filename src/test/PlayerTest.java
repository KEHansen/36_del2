package test;

import klasser.Player;

import static org.junit.Assert.*;

public class PlayerTest {

    @org.junit.Test
    public void addMoney() {
        Player p1 = new Player();
        p1.setMoney(100);
        int[] arr = {100, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, -650};
        for (int i = 0; i < 10000; i++) {
            p1.addMoney(arr[(int) (Math.random()*12)]);
            assertEquals(true, p1.getMoney() >= 0);
        }
    }
}