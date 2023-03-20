package A3Q2;
import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(10);
        list.add(52);
        list.add(511);
        list.add(200);
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if(list== null || list.size() == 0) return null;
        int max = list.get(0);
        for(int i =0; i< list.size(); i++) {
            if(list.get(i) > max) max = list.get(i);
        }

        return max;
    }
}
