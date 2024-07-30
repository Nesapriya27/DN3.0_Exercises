import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.75),
            new Order("O002", "Bob", 125.50),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "Diana", 75.20),
            new Order("O005", "Eve", 180.30),
            new Order("O006", "Frank", 220.10)
        };
        System.out.println("Unsorted Orders:");
        printOrders(orders);
        //Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        printOrders(bubbleSortedOrders);

        //QuickSort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        printOrders(quickSortedOrders);
    }
    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
