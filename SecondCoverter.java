import java.util.Scanner;
public class SecondCoverter {

	public static void main (String args[]){
	System.out.print("Enter the total seconds to be converted: ");
	
	int h = 0;
	int m = 0;
	int s = 0;
	//This gets the input number of seconds.
	Scanner input = new Scanner(System.in);
	int totalS = input.nextInt();
	h = totalS/3600; 
	m = totalS%3600/60;
	s = totalS%3600%60;
	
	System.out.print(totalS + " total seconds is " + h + " hours " + m + " minutes and " + s + " seconds.");
}

}
