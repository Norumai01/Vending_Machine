public class VendRunner {
    public static void dispensedChecker(Product product) {
        if (product != null) {
            System.out.println("Dispensed: " + product.getName() + "\n");
        }
        else {
            System.out.println("Product not available\n");
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        try {
            Snack doritosCoolRanch = new Snack("Doritos Cool Ranch", 0.75, false);
            Beverage cocaCola = new Beverage("Coca Cola", 0.82, 16.0);

            vm.addProduct("A1", new Slot<>(doritosCoolRanch,18));
            vm.addProduct("A2", new Slot<>(cocaCola,22));

            vm.displayProducts();

            Product dispensed = vm.dispenseProduct("A1");
            dispensedChecker(dispensed);
            dispensed = vm.dispenseProduct("A5");
            dispensedChecker(dispensed);

            vm.displayProducts();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Beverage drPepper = new Beverage("Dr. Pepper", 0.75, -17.3);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            Snack Lays = new Snack("Lays Chip", -0.75, false);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            Beverage drPepper = new Beverage("Dr. Pepper", 0.75, 17.3);
            vm.addProduct(null, new Slot<>(drPepper,22));
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}