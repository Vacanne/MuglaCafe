// OrderItem class representing an item in the order
class OrderItem {
    private Beverage beverage;
    private int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return beverage.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + beverage + " " + getTotalPrice() + " TL";
    }
}