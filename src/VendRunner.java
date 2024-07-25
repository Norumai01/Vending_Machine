public class VendRunner {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        Snack doritosCoolRanch = new Snack("Doritos Cool Ranch", 0.75, false);
        Beverage cocaCola = new Beverage("Coca Cola", 0.82, 16.0);

        vm.addProduct("A1", new Slot<>(doritosCoolRanch,18));
        vm.addProduct("A2", new Slot<>(cocaCola,22));

        vm.displayProducts();

        Product dispensed = vm.dispenseProduct("A1");
        if (dispensed != null) {
            System.out.println("Dispensed: " + dispensed.getName() + "\n");
        }

        vm.displayProducts();
    }
}