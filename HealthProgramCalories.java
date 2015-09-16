import java.util.Scanner; 

public class HealthProgramCalories {
public static void main (String args[]){

	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter number of years to determine approxamite calorie consumption: ");
	long years= scnr.nextInt();
	long days = years*365;
	long calDaily = 1700;
	long calTotal = days*calDaily;
	System.out.println("You have consumed approximately " + calTotal + " calories in " + years + " years.");

	System.out.print("Enter the number of years to determine how old you are in minutes/seconds: ");
	years = scnr.nextInt();
    long minutes = years*525949;
    long seconds = minutes*60;
    System.out.println("You are "+ minutes + " minutes old.\nYou are "+ seconds + " seconds old.");
    
    System.out.print("Enter the number of years to determine how many times your heart has beat: ");
    years = scnr.nextInt();
    minutes = years*525949;
    final int heartBeat = 72;
    long heartBeatYear = minutes*heartBeat;
    System.out.println("Your heart has beat approximately " + heartBeatYear + " times.");
    
    System.out.print("Enter the number of years to determine how much you have sneezed: ");
    years = scnr.nextInt();
    days = years *  365;
   System.out.println("You have sneezed approxixmately " + (int) (days * 1.2) + " times."  );
    
   System.out.print("Enter the number of years to determine approximately how many times you have urinated: ");
   years = scnr.nextInt();
   days = years * 365;
   final int urinationDaily = 7;
   long urinationTotal = days * urinationDaily; 
   System.out.println("You have urinated approximately " + urinationTotal +  " times.");
}
}
