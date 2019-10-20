package test;

import Klasser.Dice;
import Klasser.Player;

import java.util.Scanner;

public class TheGame {
    private static final int MAX_MONEY = 3000;
    public static Dice d1 = new Dice(); //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice(); //Laver et objekt ved navn d2 ud fra dice klassen
    public static Scanner key = new Scanner(System.in);

    public static Player player1 = new Player();
    public static Player player2 = new Player();


    //-------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // play intro, som ses i bunden.
        playStart();

        //-------------------------------------------------------------------------------------------------

        int boardplace = (d1 && d2)

        while ((player1.getMoney() < MAX_MONEY) || (player2.getMoney() < MAX_MONEY)) {

            switch (Boardplace) {
                case 1:
                    "back to home town" + " it's dangerous to go alone, here take" + Player.getmoney + 100;
                    return boardplace;
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
                    if (boardplace > MAX) {
                        return case 1;

                    }
                    else if (win == true) {
                        Player + "Won the game with" + money
                        break;
                    }


            }
        }
    }


    //-----------------------------------------------------------------------------------
    public static void playStart(){

        //INTRO dialog

        System.out.println("WELCOME PLAYERS!");
        System.out.println("TO A WORLD OF ADVENTURE");
        System.out.println("BEFORE WE START, LETS ME KNOW YOUR NAMES");
        System.out.println(" ");
        System.out.println("Player 1, enter your name:");
        String p1 = key.nextLine();
       player1.setName(p1);


        System.out.println( player1.getName() +" " + "I REALLY LIKE THAT NAME!");
        System.out.println("WHAT ABOUT YOU, WHAT IS YOUR NAME?");
        System.out.println(" ");
        System.out.println("Player 2, enter your name:");
        String p2 = key.nextLine();
        player2.setName(p2);

        System.out.println( player2.getName()+ " " + "WHAT A COOL NAME!");
        System.out.println(" ");
        System.out.println("BEFORE WE START, I HAVE A GIFT FOR BOTH OF YOU");
        System.out.println(" ");
        System.out.println("(click enter to get your gifts) ");
        key.nextLine();
        System.out.println("(you both reseive 1000 start points)");
        System.out.println(" ");
        System.out.println("lET US DIVE INTO A WORLD FULL OF ADVENTURE!");
        System.out.println(" ");
        System.out.println("(click enter to start game) ");
        key.nextLine();
        //------------------------------------------------------------------------------

    }
}

