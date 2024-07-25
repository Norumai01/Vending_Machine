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
}