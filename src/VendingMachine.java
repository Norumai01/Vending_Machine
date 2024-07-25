import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Slot<? extends Product>> slots;

    public VendingMachine() {
        this.slots = new HashMap<String, Slot<? extends Product>>();
    }

    public void addProduct(String code, Slot<? extends Product> slot) {
        slots.put(code, slot);
    }

    public Product dispenseProduct(String code) {
        if (slots != null && slots.containsKey(code)) {
            int qty = slots.get(code).getQuantity();
            if (qty > 0) {
                slots.get(code).setQuantity(qty - 1);
            }
            return slots.get(code).getProduct();
        }
        //System.out.println("Product not available");
        return null;
    }

    public void displayProducts() {
        for(String code : slots.keySet())
        {
            System.out.println(code + ": " + slots.get(code).getProduct().getName());
            System.out.println("Price: " + slots.get(code).getProduct().getPrice() + " " + "Quantity: " + slots.get(code).getQuantity());
            System.out.println();
        }
    }
}
