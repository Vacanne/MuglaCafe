// Beverage class representing the base class for all beverages
abstract class Beverage {
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    private String name;
    private int size;

    public Beverage(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        String sizeStr;
        switch (size) {
            case SMALL:
                sizeStr = "Small";
                break;
            case MEDIUM:
                sizeStr = "Medium";
                break;
            case LARGE:
                sizeStr = "Large";
                break;
            default:
                sizeStr = "";
        }
        return sizeStr + " " + name;
    }
}