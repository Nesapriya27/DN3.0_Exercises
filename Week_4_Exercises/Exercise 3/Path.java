@GetMapping("/{id}")
public ResponseEntity<Book> getBookById(@PathVariable Long id) {
    Optional<Book> book = books.stream().filter(b -> b.getId().equals(id)).findFirst();
    if (book.isPresent()) {
        return ResponseEntity.ok(book.get());
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
