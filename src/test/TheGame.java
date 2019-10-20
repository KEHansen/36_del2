package test;

import Klasser.Dice;
import Klasser.Player;

import java.util.Scanner;

//----------------------------------------------------------------------------------------------------------------------

public class TheGame {
    private static final int MAX_MONEY = 3000;          // maks for at vinde spillet
    public static Dice d1 = new Dice();                 //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice();                 //Laver et objekt ved navn d2 ud fra dice klassen
    public static int roll1, roll2, counter = 0;
    public static Scanner key = new Scanner(System.in); // en scanner

    public static Player player1 = new Player();        // navnet som bliver holdt på spiller 1
    public static Player player2 = new Player();        // navnet som bliver holdt på spiller 2


    //------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // play intro, som ses i bunden.
        playStart();

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------

        // terning kasten for player 1 og player 2

        // hvis det er under 3000 som er MAX_MONEY så skal den forsæt med dette
        while ((player1.getMoney() < MAX_MONEY) || (player2.getMoney() < MAX_MONEY)) {

            // kast terningerne
            System.out.println("___________________________________________________________ ");
            System.out.println(" ");
            System.out.println("(" + player1.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            roll1 = d1.roll();
            roll2 = d2.roll();
            counter = roll1 + roll2;


            System.out.println("you roll:" + counter);
            System.out.println(" ");

            boardFields(counter, player1);

            System.out.println("___________________________________________________________ ");
            System.out.println(" ");
            System.out.println("(" + player2.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            roll1 = d1.roll();
            roll2 = d2.roll();
            counter = roll1 + roll2;

            System.out.println("you roll:" + counter);
            System.out.println(" ");
           boardFields(counter, player2);
        }
    }


    //------------------------------------------------------------------------------------------------------------------

    // Selve bræt felterne

        public static void boardFields( int counter, Player player) {
            switch (counter) {
                case 1:
                    player.addMoney(+100);
                    System.out.println("(BACK TO HOME TOWN)");
                    System.out.println("it's dangerous to go alone, here take 100");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 2:
                    player.addMoney(+250);
                    System.out.println("(TOWER)");
                    System.out.println("you saved the princess, she gave you 250");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 3:
                    player.addMoney(-100);
                    System.out.println("(CRATER)");
                    System.out.println("you nearly fell down the crater, only some money felt down");
                    System.out.println("you lost 100");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 4:
                    player.addMoney(+100);
                    System.out.println("(PALACE GATE)");
                    System.out.println("you sells some off you stuff to the prince");
                    System.out.println("you earned 100");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 5:
                    player.addMoney(-20);
                    System.out.println("(COLD DESERT)");
                    System.out.println("you´re about to head into th cold Desert. So you buy a scarf");
                    System.out.println("you lose 20");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 6:
                    player.addMoney(+180);
                    System.out.println("(WALLED CITY)");
                    System.out.println("you sell a merchant a rare brick to a wall");
                    System.out.println("you earn 180");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("(MONASTERY)");
                    System.out.println("you just went by, nothing happened");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 8:
                    player.addMoney(-70);
                    System.out.println("(BLACK CAVE)");
                    System.out.println("you dropped some money on your way out, never to be found again");
                    System.out.println("you lost 70");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 9:
                    player.addMoney(+60);
                    System.out.println("(HUTS IN THE MOUNTAIN)");
                    System.out.println("you show the villages memes. They love it and give you a present");
                    System.out.println("you earn 60");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 10:
                    player.addMoney(-80);
                    System.out.println("(THE WEREWOLF-WALL)");
                    System.out.println("you ran in fear for a hairy beast");
                    System.out.println("you lose 80 but ran so fast to get a ekstra turn");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    System.out.println("(click enter to roll again!)");
                    key.nextLine();
                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    counter = roll1 + roll2;

                    System.out.println("you roll:" + counter);
                    System.out.println(" ");
                case 11:
                    player.addMoney(-50);
                    System.out.println("(THE PIT)");
                    System.out.println("you throw some money to check how deep the pit is");
                    System.out.println("you lose -50");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;
                case 12:
                    player.addMoney(+650);
                    System.out.println("(GOLDMINE)");
                    System.out.println("you struck GOOOOLD!!!");
                    System.out.println("ah yea alot of money, you earn 650!");
                    System.out.println(" ");
                    System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                    System.out.println(" ");
                    break;

                /*default:
                    if (boardplace > MAX) {
                        return case 1;

                    }*/
            }
        }


    //------------------------------------------------------------------------------------------------------------------

    //INTRO dialog

    public static void playStart(){

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

