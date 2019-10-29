package test;

import klasser.Dice;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void rollStatistics() {
        Dice dice1 = new Dice();
        int antalSlag = 100000;
        float[] arr = new float[6];
        int t = 0;
        for (int i = 0; i < antalSlag; i++) {
            t = dice1.roll() - 1;
            arr[t] = arr[t] + 1;
        }
        for (int i = 0; i < 6; i++) {
            assertEquals(16.67, arr[i] / antalSlag * 100, 4);
        }
    }

    @org.junit.Test
    public void roll() {
        Dice dice1 = new Dice();
        for (int i = 0; i < 1000000; i++) {
            assertEquals(3.5, dice1.roll(), 2.5);
        }
    }
}