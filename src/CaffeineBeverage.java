// CaffeineBeverage class representing caffeinated beverages
abstract class CaffeineBeverage extends Beverage {
    private boolean milkAdded;

    public CaffeineBeverage(String name, int size, boolean milkAdded) {
        super(name, size);
        this.milkAdded = milkAdded;
    }

    public boolean isMilkAdded() {
        return milkAdded;
    }

    public double getMilkCost() {
        return milkAdded ? 1.0 : 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + (milkAdded ? " with Milk" : " without Milk");
    }
}