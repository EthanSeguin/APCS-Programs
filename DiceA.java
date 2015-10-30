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

                if (rollTotal == 2) {
                    ++numX[2];
                } else if (rollTotal == 3) {
                    ++numX[3];
                } else if (rollTotal == 4) {
                    ++numX[4];
                } else if (rollTotal == 5) {
                    ++numX[5];
                } else if (rollTotal == 6) {
                    ++numX[6];
                } else if (rollTotal == 7) {
                    ++numX[7];
                } else if (rollTotal == 8) {
                    ++numX[8];
                } else if (rollTotal == 9) {
                    ++numX[9];
                } else if (rollTotal == 10) {
                    ++numX[10];
                } else if (rollTotal == 11) {
                    ++numX[11];
                } else if (rollTotal == 12) {
                    ++numX[12];
                }




                System.out.println("Roll " + (i + 1) + " is " +
                    rollTotal + " (" + die1 +
                    "+" + die2 + ")");
            }

            // Print statistics on dice rolls
            if (numRolls >= 1) {
                System.out.println("\nDice roll statistics:");
                System.out.println("2s: " + numX[2]);
                System.out.println("3s: " + numX[3]);
                System.out.println("4s: " + numX[4]);
                System.out.println("5s: " + numX[5]);
                System.out.println("6s: " + numX[6]);
                System.out.println("7s: " + numX[7]);
                System.out.println("8s: " + numX[8]);
                System.out.println("9s: " + numX[9]);
                System.out.println("10s: " + numX[10]);
                System.out.println("11s: " + numX[11]);
                System.out.println("12s: " + numX[12]);


                System.out.print("2s: ");
                for (int j = 1; j <= numX[2]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("3s: ");
                for (int j = 1; j <= numX[3]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("4s: ");
                for (int j = 1; j <= numX[4]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("5s: ");
                for (int j = 1; j <= numX[5]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("6s: ");
                for (int j = 1; j <= numX[6]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("7s: ");
                for (int j = 1; j <= numX[7]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("8s: ");
                for (int j = 1; j <= numX[8]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("9s: ");
                for (int j = 1; j <= numX[9]; ++j) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("10s: ");
                for (int j = 1; j <= numX[10]; ++j) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print("11s: ");
                for (int j = 1; j <= numX[11]; ++j) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("12s: ");
                for (int j = 1; j <= numX[12]; ++j) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }


        return;


    }
}