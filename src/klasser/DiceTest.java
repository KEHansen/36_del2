package klasser;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void roll() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        assertEquals(1, dice1.roll());
        assertEquals(2,dice1.roll());
        assertEquals(2,dice1.roll()+dice2.roll(), 12);
    }

    @org.junit.Test
    public void rollOutside() {
        Dice dice1 = new Dice();
        for (int i = 0; i < 1000000; i++) {
            assertEquals(3.5, dice1.roll(), 2.5);
        }
    }

    @org.junit.Test
    public void rollInside(){

        Dice dice1 = new Dice();
        for (int i=0; i<1000000; i++){
            assertEquals(3.5, dice1.roll(),2.5);
        }
    }
}