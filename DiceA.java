
import java.util.Scanner;
import java.util.Random;

public class DiceA {
   public static void main(String args[]) {
      
	   Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int numRolls =1;   // User defined number of rolls
      while(numRolls >=1){
      int i = 0;          // Loop counter iterates numRolls times
      int numTwos = 0;   // Tracks number of 2s found
      int numThrees = 0;  // Tracks number of 3s found
      int numFours = 0;   // Tracks number of 4s found
      int numFives = 0;  // Tracks number of 5s found
      int numSixes = 0;   // Tracks number of 6s found
      int numSevens = 0;  // Tracks number of 7s found
      int numEights = 0;  // Tracks number of 8s found
      int numNines = 0;   // Tracks number of 9s found
      int numTens = 0;  // Tracks number of 10s found
      int numElevens = 0;   // Tracks number of 11s found
      int numTwelves = 0;  // Tracks number of 12s found
      int die1 = 0;       // Dice values
      int die2 = 0;       // Dice values
      int rollTotal = 0;  // Sum of dice values


      System.out.println("Enter number of rolls: ");
      numRolls = scnr.nextInt();

      
         // Roll dice numRoll times
         for (i = 0; i < numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            rollTotal = die1 + die2;

            // Count number of sixs and sevens
           
             if (rollTotal == 2) {
                numTwos = numTwos + 1;
             }
             else if (rollTotal == 3) {
                numThrees = numThrees + 1;
             }
            else if (rollTotal == 4) {
                numFours = numFours + 1;
             }
             else if (rollTotal == 5) {
                numFives = numFives + 1;
             }
            else if (rollTotal == 6) {
               numSixes = numSixes + 1;
            }
            else if (rollTotal == 7) {
               numSevens = numSevens + 1;
            }
            else if (rollTotal == 8) {
                numEights = numEights + 1;
             }
             else if (rollTotal == 9) {
                numNines = numNines + 1;
             }else if (rollTotal == 10) {
                 numTens = numTens + 1;
             }
             else if (rollTotal == 11) {
                numElevens = numElevens + 1;
             }else if (rollTotal == 12) {
                 numTwelves = numTwelves + 1;
             }
             
            
            
            
            
            
            
            System.out.println("Roll " + (i+1) + " is " + 
                  rollTotal + " (" + die1 + 
                  "+" + die2 + ")");
         }

         // Print statistics on dice rolls
         if(numRolls >=1){
         System.out.println("\nDice roll statistics:");
         System.out.println("2s: " + numTwos);
         System.out.println("3s: " + numThrees);
         System.out.println("4s: " + numFours);
         System.out.println("5s: " + numFives);
         System.out.println("6s: " + numSixes);
         System.out.println("7s: " + numSevens);
         System.out.println("8s: " + numEights);
         System.out.println("9s: " + numNines);
         System.out.println("10s: " + numTens);
         System.out.println("11s: " + numElevens);
         System.out.println("12s: " + numTwelves);
         
         
         System.out.print("2s: ");
         for (int j =1; j <=numTwos;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("3s: ");
         for (int j =1; j <=numThrees;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("4s: ");
         for (int j =1; j <=numFours;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("5s: ");
         for (int j =1; j <=numFives;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("6s: ");
         for (int j =1; j <=numSixes;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("7s: ");
         for (int j =1; j <=numSevens;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("8s: ");
         for (int j =1; j <=numEights;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("9s: ");
         for (int j =1; j <=numNines;++j){
        System.out.print("*");	 
         }
         System.out.println();
         
         System.out.print("10s: ");
         for (int j =1; j <=numTens;++j){
        System.out.print("*");	 
         }
         System.out.println();
         System.out.print("11s: ");
         for (int j =1; j <=numElevens;++j){
        System.out.print("*");	 
         }
         System.out.println();
         
         System.out.print("12s: ");
         for (int j =1; j <=numTwelves;++j){
        System.out.print("*");	 
         }
         System.out.println();
                  
         }
      } 
      

      return;

      
      }
   }

