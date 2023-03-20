package A3Q3;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(10);
        list.add(511);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(52);
        list.add(200);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
