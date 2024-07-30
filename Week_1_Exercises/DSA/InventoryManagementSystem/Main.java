public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("P001", "TV", 10, 1000.0);
        Product product2 = new Product("P002", "Mobile", 20, 500.0);
        Product product3 = new Product("P003", "Lap", 15, 300.0);

        ims.addProduct(product1);
        ims.addProduct(product2);
        ims.addProduct(product3);

        ims.displayInventory();

        Product updatedProduct = new Product("P002", "Smartphone", 25, 450.0);
        ims.updateProduct("P002", updatedProduct);

        ims.displayInventory();

        ims.deleteProduct("P003");

        ims.displayInventory();
    }
}
