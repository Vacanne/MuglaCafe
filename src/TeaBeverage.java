// TeaBeverage class representing tea beverages
abstract class TeaBeverage extends Beverage {
    private boolean lemonAdded;

    public TeaBeverage(String name, int size, boolean lemonAdded) {
        super(name, size);
        this.lemonAdded = lemonAdded;
    }

    public boolean isLemonAdded() {
        return lemonAdded;
    }

    public double getLemonCost() {
        return lemonAdded ? 1.0 : 0.0;
    }


    @Override
    public String toString() {
        return super.toString() + (lemonAdded ? " with Lemon" : " without Lemon");
    }
}
