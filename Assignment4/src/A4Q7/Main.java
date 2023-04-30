package A4Q7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Heba.txt");

        if(!file.exists()) {
            PrintWriter writer = new PrintWriter(file);
            for(int i =0; i<100; i++) {
                writer.println((int)(Math.random() * 100));
            }
            writer.close();
        }
        Scanner input = new Scanner(file);
        int[] arr = new int[100];
        int i =0;
        while(input.hasNextLine()) {
            arr[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        for(int j =0; j<100; j++) {
            System.out.println(arr[j]);
        }
    }
}
