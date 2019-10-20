package test;

import Klasser.Dice;
import Klasser.Player;

import java.util.Scanner;

public class TheGame {
    private static final int MAX_MONEY = 3000;          // maks for at vinde spillet
    public static Dice d1 = new Dice();                 //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice();                 //Laver et objekt ved navn d2 ud fra dice klassen
    public static int slag1, slag2, tæller1 = 0, tæller2 = 0;
    public static Scanner key = new Scanner(System.in); // en scanner

    public static Player player1 = new Player();        // navnet som bliver holdt på spiller 1
    public static Player player2 = new Player();        // navnet som bliver holdt på spiller 2


    //-----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // play intro, som ses i bunden.
        playStart();

        //-------------------------------------------------------------------------------------------------


        // hvis det er under 3000 som er MAX_MONEY så skal den forsæt med dette
        while ((player1.getMoney() < MAX_MONEY) || (player2.getMoney() < MAX_MONEY)) {

            // kast terningerne
            System.out.println("(click enter to throw the die)");
            key.nextLine();
            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            slag1 = d1.roll();
            slag2 = d2.roll();
            tæller1 = slag1 + slag2;


            System.out.println("you roll:" + tæller1);
            System.out.println(" ");

            switch (tæller1) {
                case 1:
                    player1.addMoney(+100);
                    System.out.println("(BACK TO HOME TOWN)");
                    System.out.println("it's dangerous to go alone, here take 100");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 2:
                    player1.addMoney(+250);
                    System.out.println("(TOWER)");
                    System.out.println("you saved the princess, she gave you 250");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 3:
                    player1.addMoney(-100);
                    System.out.println("(CRATER)");
                    System.out.println("you nearly fell down the crater, only some money felt down");
                    System.out.println("you lost 100");
                    System.out.println(player1.getName()+ " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 4:
                    player1.addMoney(+100);
                    System.out.println("(PALACE GATE)");
                    System.out.println("you sells some off you stuff to the prince");
                    System.out.println("you earned 100");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 5:
                    player1.addMoney(-20);
                    System.out.println("(COLD DESERT)");
                    System.out.println("you´re about to head into th cold Desert. So you buy a scarf");
                    System.out.println("you lose 20");
                    System.out.println(player1.getName()+ " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 6:
                    player1.addMoney(+180);
                    System.out.println("(WALLED CITY");
                    System.out.println("you sell a rare wall to a merchant");
                    System.out.println("you earn 180");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("(MONASTERY)");
                    System.out.println("you just went by, nothing happened");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 8:
                    player1.addMoney(-70);
                    System.out.println("(BLACK CAVE)");
                    System.out.println("you dropped some money on your way out, never to be found again");
                    System.out.println("you lost 70");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 9:
                    player1.addMoney(+60);
                    System.out.println("(HUTS IN THE MOUNTAIN)");
                    System.out.println("you show the villages memes. They love it and give you a present");
                    System.out.println("you earn 60");
                    System.out.println(player1.getName() + " " + "you have: " +player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 10:
                    player1.addMoney(-80);
                    System.out.println("(THE WEREWOLF-WALL)");
                    System.out.println("you ran in fear for a hairy beast");
                    System.out.println("you lose 80 but ran so fast to get a ekstra turn");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    slag1 = d1.roll();
                    slag2 = d2.roll();
                    tæller1 = slag1 + slag2;

                    System.out.println("you roll:" + tæller1);
                    System.out.println(" ");
                case 11:
                    player1.addMoney(-50);
                    System.out.println("(THE PIT)");
                    System.out.println("you throw some money to check how deep the pit is");
                    System.out.println("you lose -50");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 12:
                    player1.addMoney(+650);
                    System.out.println("(GOLDMINE)");
                    System.out.println("you struck GOOOOLD!!!");
                    System.out.println("ah yea alot of money, you earn 650!");
                    System.out.println(player1.getName() + " " + "you have: " + player1.getMoney() + "points");
                    System.out.println(" ");
                    break;

                /*default:
                    if (boardplace > MAX) {
                        return case 1;

                    }*/
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
        System.out.println("you both reseive 1000 start points!");
        System.out.println(" ");
        System.out.println("lET US DIVE INTO A WORLD FULL OF ADVENTURE!");
        System.out.println("___________________________________________________________ ");
        System.out.println(" ");
        System.out.println("(click enter to start game) ");
        key.nextLine();

        //------------------------------------------------------------------------------

    }
}

