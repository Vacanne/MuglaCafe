import java.util.ArrayList;
import java.util.List;

// Order class representing the overall order
class Order {
    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void add(OrderItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("TOTAL: ").append(getTotalPrice()).append(" TL");
        return sb.toString();
    }
}