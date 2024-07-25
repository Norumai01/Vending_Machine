public class Snack extends Product {
    private boolean isVegan;

    public Snack(String name, double price, boolean isVegan) {
        super(name, price);
        this.isVegan = isVegan;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Snack{" + "isVegan=" + isVegan + '}';
    }
}
