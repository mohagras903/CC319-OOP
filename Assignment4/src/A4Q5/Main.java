package A4Q5;
import java.net.URL;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       try {
           URL srcUrl = new URL("http://cs.armstrong.edu/liang/data/lincoln.txt");
           Scanner data = new Scanner(srcUrl.openStream());
           int wordsCounter = 0;
           while(data.hasNext()) {
               if(data.next() == "") {
                   wordsCounter++;
               }
           }
           System.out.println(wordsCounter);
       }
       catch(Exception e) {
           System.out.println(e.getMessage());
       }
   }
}
