import java.util.Scanner;
public class MadLib {
public static void main (String args[]){
	String noun1, noun2, noun3, noun4, verb1, noun5,  
noun6, verb2, number1, adjective1, verb3, noun7, 
verb4, verb5, verb6, noun8, noun9, verb7, noun10,
noun11, place1,  noun12, verb8, noun13, adjective2,
noun14, verb9, verb10,  noun15, adjective3, noun16, 
noun17, verb11, noun18  ;
	
Scanner scnr = new Scanner(System.in);
System.out.print("Noun: ");
noun1 = scnr.nextLine();
System.out.print("Noun: ");
noun2 = scnr.nextLine();
System.out.print("Noun: ");
noun3 = scnr.nextLine(); 

System.out.println ("Look at this " + noun1 + " isn`t it neat? Wouldn`t you think my collection`s complete?");
System.out.println("Wouldn`t you think I`m the " + noun2 + " The " + noun2 + " who has everything?");
System.out.println("Look at this " + noun3 + ", treasures untold.");

}
}
