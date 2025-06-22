public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 20, 499.50);
        Product p3 = new Product("P003", "Tablet", 15, 299.75);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("Inventory after adding products:");
        manager.printInventory();

        manager.updateProduct("P002", 25, 479.99);
        System.out.println("\nInventory after updating Smartphone:");
        manager.printInventory();

        manager.deleteProduct("P001");
        System.out.println("\nInventory after deleting Laptop:");
        manager.printInventory();

        Product retrieved = manager.getProduct("P003");
        System.out.println("\nRetrieved product:");
        if (retrieved != null) {
            System.out.println(retrieved.getProductId() + " - " + retrieved.getProductName() +
                " | Qty: " + retrieved.getQuantity() + " | Price: $" + retrieved.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }
}
