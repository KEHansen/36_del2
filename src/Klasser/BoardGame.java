package Klasser;

public class BoardGame {

private int board;
private final int MAX = 12;


public BoardGame(int Board) {
    while (Board > 0 || Board < 12) {

        switch (Board) {
            case 1:
                "back to home town" + " it'sdangerous to go alone, here take" + money + 100

            case 2:
                "tower" + money + 250
            case 3:
                "crater" + money - 100
            case 4:
                " Palace gates" + 100
            case 5:
                "Cold Desert" + money - 20
            case 6:
                " Walled city" + money + 180
            case 7:
                "Monastery" + money + 0
            case 8:
                "black cave" + money - 70
            case 9:
                " huts in the mountain " + money + 60
            case 10:
                "the werewolf-wall" + money - 80 + " ekstra tur"
            case 11:
                "the pit" - 50
            case 12:
                "goldmine" + 650

            default:
               if (board > 12) {
                   return case 1;
               }


                break;


        }
    }
}