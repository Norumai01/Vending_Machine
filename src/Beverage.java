public class Beverage extends Product {
    private double flOunces;

    public Beverage(String name, double price, double flOunces) {
        super(name, price);
        this.flOunces = flOunces;
        if (flOunces < 0) {
            throw new IllegalArgumentException("FlOunces must be a positive number");
        }
    }

    public double getFlOunces() {
        return flOunces;
    }

    public void setFlOunces(double flOunces) {
        this.flOunces = flOunces;
        if (flOunces < 0) {
            throw new IllegalArgumentException("FlOunces must be a positive number");
        }
    }

    @Override
    public String toString() {
        return "Beverage [flOunces=" + flOunces + "]";
    }
}
