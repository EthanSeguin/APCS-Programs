//This is version 1 
import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.next();

      if (origTweet.equalsIgnoreCase("LOL")) {
         System.out.println("LOL = laughing out loud");
      }
      else if (origTweet.equalsIgnoreCase("BFN")) {
         System.out.println("BFN = bye for now");
      }
      else if (origTweet.equalsIgnoreCase("FTW")) {
         System.out.println("FTW = for the win");
      }
      else if (origTweet.equalsIgnoreCase("IRL")) {
         System.out.println("IRL = in real life");
      }
      else if (origTweet.equalsIgnoreCase("AFK ")) {
          System.out.println("AFK = Away From Keyboard ");
       }
      else if (origTweet.equalsIgnoreCase("ROTFLOL")) {
          System.out.println("ROTFLOL = Rolling On The Floor Laughing Out Loud");
       }
      else if (origTweet.equalsIgnoreCase("NIN")) {
           System.out.println("NIN = Nine Inch Nails");
        }
      else if (origTweet.equalsIgnoreCase("A7X")) {
          System.out.println("A7X = Avenged Sevenfold");
       }
      else if (origTweet.equalsIgnoreCase("MM")) {
          System.out.println("MM = Marilyn Manson");
       }  
      else {
         System.out.println("Sorry, don't know that one.");
      }
      

      return;
   }
}
