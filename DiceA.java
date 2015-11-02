import java.util.Scanner;
import java.util.Random;

public class DiceA {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int numRolls = 1; // User defined number of rolls
        while (numRolls >= 1) {
            int i = 0; // Loop counter iterates numRolls times
            int[] numX = new int[13];
            int die1 = 0; // Dice values
            int die2 = 0; // Dice values
            int rollTotal = 0; // Sum of dice values


            System.out.println("Enter number of rolls: ");
            numRolls = scnr.nextInt();


            // Roll dice numRoll times
            for (i = 0; i < numRolls; ++i) {
                die1 = randGen.nextInt(6) + 1;
                die2 = randGen.nextInt(6) + 1;
                rollTotal = die1 + die2;

                // Count number of sixs and sevens

                for (int j = 2; j <= 12; ++j) {
                    if (rollTotal == j) {
                        ++numX[j];
                    }
                }



                System.out.println("Roll " + (i + 1) + " is " +
                    rollTotal + " (" + die1 +
                    "+" + die2 + ")");
            }

            // Print statistics on dice rolls
            if (numRolls >= 1) {
                for (int k = 2; k <= 12; ++k) {
                    System.out.println(k + "s: " + numX[k]);
                }

                for (int m = 2; m <= 12; ++m) {
                    System.out.print(m + "s: ");
                    for (int n = 1; n <= numX[m]; ++n) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }


        return;


    }
}