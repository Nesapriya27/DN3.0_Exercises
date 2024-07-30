import java.util.Arrays;
import java.util.List;

public class LibraryManagementSystem {

    public static Book binarySearch(List<Book> books, String title) {
        Book[] bookArray = books.toArray(new Book[0]);
        Arrays.sort(bookArray, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        int left = 0;
        int right = bookArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = title.compareToIgnoreCase(bookArray[mid].getTitle());

            if (comparison == 0) {
                return bookArray[mid];
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Book not found
    }
}
