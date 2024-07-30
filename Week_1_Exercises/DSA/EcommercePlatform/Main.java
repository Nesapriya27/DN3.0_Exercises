import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("A123", "Air Conditioner", "Appliances"),
            new Product("B456", "Blender", "Kitchen"),
            new Product("C789", "Chair", "Furniture"),
            new Product("D012", "Desk Lamp", "Lighting"),
            new Product("E345", "Electric Kettle", "Kitchen"),
            new Product("F678", "Fan", "Appliances"),
            new Product("G901", "Gaming Console", "Electronics"),
            new Product("H234", "Heater", "Appliances"),
            new Product("I567", "Iron", "Appliances"),
            new Product("J890", "Juicer", "Kitchen")
        };
        String searchId = "C789";
        Product result = LinearSearch.linearSearch(products, searchId);
        if (result != null) {
            System.out.println("Linear Search: Product found - " + result);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        result = BinarySearch.binarySearch(products, searchId);
        if (result != null) {
            System.out.println("Binary Search: Product found - " + result);
        } else {
            System.out.println("Binary Search: Product not found.");
        }

        String searchIdAnother = "F678";
        Product resultAnother = BinarySearch.binarySearch(products, searchIdAnother);
        if (resultAnother != null) {
            System.out.println("Binary Search: Product found - " + resultAnother);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
