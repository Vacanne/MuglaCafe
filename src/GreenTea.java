// GreenTea class representing Green Tea beverage
class GreenTea extends TeaBeverage {
    private static final double[] PRICES = {4.0, 5.0, 6.0};

    public GreenTea(boolean lemonAdded, int size) {
        super("Green Tea", size, lemonAdded);
    }

    @Override
    public double getPrice() {
        return PRICES[getSize()] + getLemonCost();
    }
}