public class Slot <T extends Product> {
    private T product;
    private int quantity;

    public Slot(T product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        if (product == null || quantity < 0) {
            throw new IllegalArgumentException("Product cannot be null or quantity cannot be less than 0.");
        }
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null/empty.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than 0.");
        }
    }

    @Override
    public String toString() {
        return  product.toString() + " " + quantity;
    }
}
