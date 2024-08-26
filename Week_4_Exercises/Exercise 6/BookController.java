package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.entity.Book;
import com.example.bookstoreapi.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // GET: Retrieve all books
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(books);
    }

    // GET: Retrieve a book by ID
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            throw new ResourceNotFoundException("Book with ID " + id + " not found.");
        }
    }

    // POST: Create a new book
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    // PUT: Update a book by ID
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Optional<Book> existingBook = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());
            book.setIsbn(updatedBook.getIsbn());
            return ResponseEntity.ok(book);
        } else {
            throw new ResourceNotFoundException("Book with ID " + id + " not found.");
        }
    }

    // DELETE: Delete a book by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        Optional<Book> existingBook = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        if (existingBook.isPresent()) {
            books.remove(existingBook.get());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            throw new ResourceNotFoundException("Book with ID " + id + " not found.");
        }
    }

    // POST: Register a book with custom headers
    @PostMapping("/register")
    public ResponseEntity<Book> registerBook(
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            @RequestParam("price") double price,
            @RequestParam("isbn") String isbn) {

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setIsbn(isbn);
        books.add(book);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Custom-Header", "CustomValue")
                .body(book);
    }
}
