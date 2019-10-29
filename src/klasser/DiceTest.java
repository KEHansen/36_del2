package klasser;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void roll() {
        Dice dice1 = new Dice();
        assertEquals(2, dice1.roll(), 6);
    }

    @org.junit.Test
    public void rollOutside() {
        Dice dice1 = new Dice();
        for (int i = 0; i < 1000000; i++) {
            assertEquals(3.5, dice1.roll(), 2.5);
        }
    }
}