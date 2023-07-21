// BlackTea class representing Black Tea beverage
class BlackTea extends TeaBeverage {
    private static final double[] PRICES = {3.0, 4.0, 5.0};

    public BlackTea(boolean lemonAdded, int size) {
        super("Black Tea", size, lemonAdded);
    }

    @Override
    public double getPrice() {
        return PRICES[getSize()] + getLemonCost();
    }
}