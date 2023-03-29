package A4Q3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please Enter 5 numbers");
        Scanner input = new Scanner(System.in);
        for(int i =0; i<5; i++) {
            System.out.print(i+1 +": ");
            list.add(input.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
