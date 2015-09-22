//This is version 3
import java.util.Scanner;

public class TweetDecoderD {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.nextLine();
if(origTweet.length() <= 140 ){


      if (origTweet.indexOf("LOL") != -1) {
         System.out.println("LOL = laughing out loud");
      }
       if (origTweet.indexOf("BFN") != -1) {
         System.out.println("BFN = bye for now");
      }
       if (origTweet.indexOf("FTW") != -1 ) {
         System.out.println("FTW = for the win");
      }
       if (origTweet.indexOf("IRL") != -1) {
         System.out.println("IRL = in real life");
      }
       if (origTweet.indexOf("AFK ") != -1) {
          System.out.println("AFK = Away From Keyboard ");
       }
       if (origTweet.indexOf("ROTFLOL")!= -1) {
          System.out.println("ROTFLOL = Rolling On The Floor Laughing Out Loud");
       }
       if (origTweet.indexOf("NIN")!= -1) {
           System.out.println("NIN = Nine Inch Nails");
        }
       if (origTweet.indexOf("A7X") != -1) {
          System.out.println("A7X = Avenged Sevenfold");
       }
       if (origTweet.indexOf("MM")!= -1) {
          System.out.println("MM = Marilyn Manson");
       }  
}
else {
System.out.println("This is longer than 140 characters. ");	
}

      

      return;
   }
}
