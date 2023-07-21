// Latte class representing Latte beverage
class Latte extends CaffeineBeverage {
    private static final double[] PRICES = {5.0, 6.0, 7.0};

    public Latte(boolean milkAdded, int size) {
        super("Latte", size, milkAdded);
    }

    @Override
    public double getPrice() {
        return PRICES[getSize()] + getMilkCost();
    }
}