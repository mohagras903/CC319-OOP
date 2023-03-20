package A3Q6;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String args[]) {
        GroceryList myList = new GroceryList();
        GroceryItemOrder item1 =  new GroceryItemOrder("Milk", 2, 18.5);
        GroceryItemOrder item2 = new GroceryItemOrder("Chips", 4, 7);
        GroceryItemOrder item3 = new GroceryItemOrder("Chocolate", 2, 16);

        try {
            myList.addItem(item1);
            myList.addItem(item2);
            myList.addItem(item3);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Cost: " + myList.getTotalCost() + " EGP");

    }

}
