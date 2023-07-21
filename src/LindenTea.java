// LindenTea class representing Linden Tea beverage
class LindenTea extends TeaBeverage {
    private static final double[] PRICES = {5.0, 6.0, 7.0};

    public LindenTea(boolean lemonAdded, int size) {
        super("Linden Tea", size, lemonAdded);
    }

    @Override
    public double getPrice() {
        return PRICES[getSize()] + getLemonCost();
    }
}