import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("B002", "1984", "George Orwell"));
        books.add(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("B004", "The Catcher in the Rye", "J.D. Salinger"));

        // Linear search example
        System.out.println("Linear Search:");
        String titleToSearch = "1984";
        Book foundBook = LibraryManagementSystem.linearSearch(books, titleToSearch);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search example (requires sorted list)
        System.out.println("\nBinary Search:");
        Book[] sortedBooksArray = books.toArray(new Book[0]);
        Arrays.sort(sortedBooksArray, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        List<Book> sortedBooksList = Arrays.asList(sortedBooksArray);
        String titleToSearchBinary = "To Kill a Mockingbird";
        Book foundBookBinary = LibraryManagementSystem.binarySearch(sortedBooksList, titleToSearchBinary);
        if (foundBookBinary != null) {
            System.out.println("Found: " + foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
