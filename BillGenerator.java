
public class BillGenerator {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order();

        // Add pizzas to the order
        order.addPizza(new Pizza("Large", "Thin Crust", new String[]{"Cheese", "Pepperoni"}, 12.99));
        order.addPizza(new Pizza("Medium", "Pan Crust", new String[]{"Mushrooms", "Olives", "Onions"}, 10.99));

        // Calculate and print the total bill
        System.out.println("Total Bill: $" + order.calculateTotalBill());
    }
}
