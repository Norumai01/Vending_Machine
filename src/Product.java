public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        if (name == null || price < 0 || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null/empty and price is less than 0.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null/empty.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price < 0) {
            throw new IllegalArgumentException("Product name cannot be null/empty and price is less than 0.");
        }
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
