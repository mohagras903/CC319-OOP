package A3Q6;

public class GroceryList {
    GroceryItemOrder[] list = new GroceryItemOrder[10];
    double cost;
    private int itemsCount = 0;

    public GroceryList(){}

    public void addItem(GroceryItemOrder item) throws Exception {
        if(itemsCount==10)
            throw new Exception("The list is full");
        list[++itemsCount] =  item;
    }

    public double getTotalCost() {
        double total = 0;
        for(int i =0; i<list.length; i++) {
            if(list[i] != null)
            total += list[i].getCost();
        }

        return total;
    }

}
