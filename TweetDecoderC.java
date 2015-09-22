//This is version 4
import java.util.Scanner;

public class TweetDecoderC {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.nextLine();

   origTweet = origTweet.replace("lol", "laughing out loud");
   origTweet = origTweet.replace("BFN", "bye for now");
   origTweet=origTweet.replace("FTW", "for the win");    
   origTweet=origTweet.replace("IRL", "in real life");      
   origTweet=origTweet.replace("AFK", "away from keyboard");    
   origTweet=origTweet.replace("ROTFLOL", "rolling on the floor laughing out loud");    
   origTweet=origTweet.replace("NIN", "Nine Inch Nails");
   origTweet=origTweet.replace("A7X", "Avenged Sevenfold");    
   origTweet=origTweet.replace("MM", "Marilyn Manson");    
      System.out.println(origTweet);
      return;
   }
}
