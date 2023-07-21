// Americano class representing Americano beverage
class Americano extends CaffeineBeverage {
    private static final double[] PRICES = {7.0, 8.0, 9.0};

    public Americano(boolean milkAdded, int size) {
        super("Americano", size, milkAdded);
    }
    
    @Override
    public double getPrice() {
        return PRICES[getSize()] + getMilkCost();
    }
}