package klasser;

import java.util.Scanner;

import static klasser.Output.player1;
import static klasser.Output.player2;


//----------------------------------------------------------------------------------------------------------------------

public class Game {
    private static final int MAX_MONEY = 3000;          // maks for at vinde spillet
    public static Dice d1 = new Dice();                 //Laver et objekt ved navn d1 ud fra dice klassen
    public static Dice d2 = new Dice();                 //Laver et objekt ved navn d2 ud fra dice klassen
    public static int counter = 0, counter1 = 0, counter2 = 0;
    public static Scanner key = new Scanner(System.in); // en scanner

          // navnet som bliver holdt på spiller 2

    //--------------------------------------------------------------------------------------------------------------

    public static void playGame(){
        // play intro
        Output.playStart();

        //--------------------------------------------------------------------------------------------------------------

        // hvis det er under 3000 som er MAX_MONEY så skal den forsæt med dette
        while ((player1.getMoney() < MAX_MONEY) && (player2.getMoney() < MAX_MONEY)) {

            //----------------------------------------------------------------------------------------------------------

            // spiller 1

            // kast terningerne
            System.out.println("____________________________________________________________________________________ ");
            System.out.println("(" + player1.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            counter = d1.roll() + d2.roll();

            System.out.println("you roll: " + counter);
            System.out.println(" ");

            counter1 = counter1 + counter;
            if (counter1>12)
                counter1 = counter1 % 12;

            // player1 bliver sendt ned i boardField som er vores case.

            Output.boardFields(counter1, player1);

            //----------------------------------------------------------------------------------------------------------

            // spiller 2

            System.out.println("____________________________________________________________________________________ ");
            System.out.println("(" + player2.getName() + "!" + " " + "click enter to throw the die)");
            key.nextLine();

            //Slår med første terning ved at bruge roll funktionen i Dice klassen for både objektet d1 og d2
            counter = d1.roll() + d2.roll();;

            System.out.println("you roll: " + counter);
            System.out.println(" ");

            counter2 = counter2 + counter;
            if (counter2>12)
                counter2 = counter2 % 12;

            // player1 bliver sendt ned i boardField som er vores case.
            Output.boardFields(counter2, player2);

            //----------------------------------------------------------------------------------------------------------
        }

        // win metoden, som står i bunden

        // vinder for spiller 1
        Output.Win(player1);

        // vinder for spiller 2
        Output.Win(player2);
    }
}
