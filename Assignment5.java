import java.util.*;
public class Assignment5 {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(101, new ArrayList<>(List.of("Jeans", "Shirt", "Belt")), true));
        orders.add(new Order(102, new ArrayList<>(List.of("Tie", "Shirt")), true));
        orders.add(new Order(103, new ArrayList<>(List.of("Tshirt", "Socks", "Tie")), true));

        ArrayList<String> allItems = getAllItems(orders);
        System.out.println(allItems);
    }

    public static ArrayList<String> getAllItems(ArrayList<Order> orders) {
        ArrayList<String> allItems = new ArrayList<>();
        for (Order order : orders) {
            allItems.addAll(order.getItemNames());
        }
        return allItems;
    }
}
class Order {
    int customerID;
    ArrayList<String> itemNames;
    boolean cashOnDelivery;

    public Order(int customerID, ArrayList<String> itemNames, boolean cashOnDelivery) {
        this.customerID = customerID;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }

    public ArrayList<String> getItemNames() {
        return itemNames;
    }
}