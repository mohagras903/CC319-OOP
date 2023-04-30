package A4Q4;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.txt");
            int currentCharCode = fileReader.read();
            while(currentCharCode != -1) {
                System.out.print((char)currentCharCode);
                currentCharCode = fileReader.read();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
