package A3Q6;

public class GroceryItemOrder {
    String name;
    int quantity;
    double cost;

    public GroceryItemOrder(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getCost() {
        return quantity * cost;
    }
}
