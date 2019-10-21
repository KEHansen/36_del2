package test;

import Klasser.Dice;
import Klasser.Player;

import java.util.Scanner;

//----------------------------------------------------------------------------------------------------------------------

public class TheGame {
    private static final int MAX_MONEY = 3000;          // maks for at vinde spillet
    public static Dice d1 = new Dice();                 //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice();                 //Laver et objekt ved navn d2 ud fra dice klassen
    public static int roll1, roll2, counter = 0, counter1 = 0, counter2 = 0;
    public static Scanner key = new Scanner(System.in); // en scanner

    public static Player player1 = new Player();        // navnet som bliver holdt på spiller 1
    public static Player player2 = new Player();        // navnet som bliver holdt på spiller 2


    //------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // play intro, som ses i bunden.
        playStart();

        //--------------------------------------------------------------------------------------------------------------

        // terning kasten for player 1 og player 2

        // hvis det er under 3000 som er MAX_MONEY så skal den forsæt med dette
        while ((player1.getMoney() < MAX_MONEY) && (player2.getMoney() < MAX_MONEY)) {

            //----------------------------------------------------------------------------------------------------------

            // spiller 1

            // kast terningerne
            System.out.println("____________________________________________________________________________________ ");
            System.out.println("(" + player1.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            roll1 = d1.roll();
            roll2 = d2.roll();
            counter = roll1 + roll2;


            System.out.println("you roll: " + counter);
            System.out.println(" ");

            counter1 = counter1 + counter;
            if (counter1 > 12)
                counter1 = counter1 % 12;

            // player1 bliver sendt ned i boardField som er vores case, længere nede.

            boardFields(counter1, player1);

            //----------------------------------------------------------------------------------------------------------

            // spiller 2

            System.out.println("____________________________________________________________________________________ ");
            System.out.println("(" + player2.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            roll1 = d1.roll();
            roll2 = d2.roll();
            counter = roll1 + roll2;

            System.out.println("you roll: " + counter);
            System.out.println(" ");

            counter2 = counter2 + counter;
            if (counter2 > 12)
                counter2 = counter2 % 12;

            // player1 bliver sendt ned i boardField som er vores case, længere nede.
            boardFields(counter2, player2);

            //----------------------------------------------------------------------------------------------------------
        }

        // win metoden, som står i bunden

        // vinder for spiller 1
        Win(player1);

        // vinder for spiller 2
        Win(player2);
    }

    //------------------------------------------------------------------------------------------------------------------

    // Selve bræt felterne

    public static void boardFields(int counter, Player player) {
        switch (counter) {
            case 1:
                player.addMoney(+100);
                System.out.println("You landed on field 1: (BACK TO HOME TOWN)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("it's dangerous to go alone, here take 100 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 2:
                player.addMoney(+250);
                System.out.println("You landed on field 2: (TOWER)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you saved the princess, she gave you 250 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 3:
                player.addMoney(-100);
                System.out.println("You landed on field 3: (CRATER)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you nearly fell down the crater, only some money felt down");
                System.out.println("you lost 100 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 4:
                player.addMoney(+100);
                System.out.println("You landed on field 4: (PALACE GATE)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you sells some off you stuff to the prince");
                System.out.println("you earned 100 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 5:
                player.addMoney(-20);
                System.out.println("You landed on field 5: (COLD DESERT)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you´re about to head into th cold Desert. So you buy a scarf");
                System.out.println("you lose 20 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 6:
                player.addMoney(+180);
                System.out.println("You landed on field 6: (WALLED CITY)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you sell a merchant a rare brick to a wall");
                System.out.println("you earn 180 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 7:
                System.out.println("You landed on field 7: (MONASTERY)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you just went by, nothing happened");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 8:
                player.addMoney(-70);
                System.out.println("You landed on field 8: (BLACK CAVE)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you dropped some money on your way out, never to be found again");
                System.out.println("you lost 70 points");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 9:
                player.addMoney(+60);
                System.out.println("You landed on field 9: (HUTS IN THE MOUNTAIN)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you show the villages memes. They love it and give you a present");
                System.out.println("you earn 60 points");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 10:
                player.addMoney(-80);
                System.out.println("You landed on field 10: (THE WEREWOLF-WALL)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you ran in fear for a hairy beast");
                System.out.println("you lose 80 points! but ran so fast, so you get a ekstra turn!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                System.out.println(" ");
                System.out.println("(click enter to roll again!)");
                //-------------------------------------------------------------------------------------------------
                // ekstra tur
                key.nextLine();
                roll1 = d1.roll();
                roll2 = d2.roll();
                counter = roll1 + roll2;

                System.out.println("you roll: " + counter);
            case 11:
                player.addMoney(-50);
                System.out.println("You landed on field 11: (THE PIT)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you throw some money to check how deep the pit is");
                System.out.println("you lose -50 points");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
            case 12:
                player.addMoney(+650);
                System.out.println("You landed on field 12: (GOLDMINE)");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("you struck GOOOOLD!!!");
                System.out.println("ah yea alot of money, you earn 650 points!");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println(player.getName() + " " + "you have: " + player.getMoney() + "points");
                break;
        }
    }


    //------------------------------------------------------------------------------------------------------------------

    //INTRO dialog metode

    public static void playStart() {

        System.out.println("WELCOME PLAYERS!");
        System.out.println("TO A WORLD OF ADVENTURE");
        System.out.println("BEFORE WE START, LETS ME KNOW YOUR NAMES");
        System.out.println(" ");
        System.out.println("Player 1, enter your name:");
        String p1 = key.nextLine();
        player1.setName(p1);


        System.out.println(player1.getName() + " " + "I REALLY LIKE THAT NAME!");
        System.out.println("WHAT ABOUT YOU, WHAT IS YOUR NAME?");
        System.out.println(" ");
        System.out.println("Player 2, enter your name:");
        String p2 = key.nextLine();
        player2.setName(p2);

        System.out.println(player2.getName() + " " + "WHAT A COOL NAME!");
        System.out.println(" ");
        System.out.println("BEFORE WE START, I HAVE A GIFT FOR BOTH OF YOU");
        System.out.println(" ");
        System.out.println("(click enter to get your gifts) ");
        key.nextLine();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  ");
        System.out.println("you both reseive 1000 start points!");
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  ");
        System.out.println(" ");
        System.out.println("lET US DIVE INTO A WORLD FULL OF ADVENTURE!");
        System.out.println("____________________________________________________________________________________ ");
        System.out.println(" ");
        System.out.println("(click enter to start game) ");
        key.nextLine();

        //------------------------------------------------------------------------------
    }

    //------------------------------------------------------------------------------------------------------------------

    //Vinder metode

    public static void Win(Player player) {
        // hvis de vinder, køre den dette igennem. Det er kun, hvis de kommer over 3000 point
        if (player.getMoney() > MAX_MONEY) {
            System.out.println("____________________________________________________________________________________ ");
            System.out.println(" ");
            System.out.println("CONGRATULATION!!!" + " " + player.getName() + " " + "you Won!!! with: " + player.getMoney() + "points");
            System.exit(0);
        }
    }
}
