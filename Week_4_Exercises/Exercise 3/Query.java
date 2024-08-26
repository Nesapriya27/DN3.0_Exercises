@GetMapping("/search")
public ResponseEntity<List<Book>> searchBooks(
        @RequestParam(value = "title", required = false) String title,
        @RequestParam(value = "author", required = false) String author) {

    List<Book> filteredBooks = books;

    if (title != null && !title.isEmpty()) {
        filteredBooks = filteredBooks.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    if (author != null && !author.isEmpty()) {
        filteredBooks = filteredBooks.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    return ResponseEntity.ok(filteredBooks);
}
