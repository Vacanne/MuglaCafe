// Cappucino class representing Cappucino beverage
class Cappucino extends CaffeineBeverage {
    private static final double[] PRICES = {6.0, 7.0, 8.0};

    public Cappucino(boolean milkAdded, int size) {
        super("Cappucino", size, milkAdded);
    }

    @Override
    public double getPrice() {
        return PRICES[getSize()] + getMilkCost();
    }
}