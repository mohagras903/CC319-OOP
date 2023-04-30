package A4Q6;

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        File myFile = new File("data.txt");
        Scanner input = new Scanner(myFile);
        int linesCounter = 0;
        int wordsCounter = 0;
        int charsCounter = 0;
        while(input.hasNextLine()) {
            String line = input.nextLine();
            wordsCounter += line.split(" ").length;
            charsCounter += line.length();
            linesCounter++;
        }
        input.close();
        System.out.println("Lines: "+ linesCounter);
        System.out.println("Words: "+ wordsCounter);
        System.out.println("Chars: "+ charsCounter);

    }
}
