
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;

    // Constructor
    public Order() {
        pizzas = new ArrayList<>();
    }

    // Method to add a pizza to the order
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    // Method to calculate total bill
    public double calculateTotalBill() {
        double totalBill = 0;
        for (Pizza pizza : pizzas) {
            totalBill += pizza.getPrice();
        }
        return totalBill;
    }
}
