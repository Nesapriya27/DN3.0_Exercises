package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.BookDTO;
import com.example.bookstoreapi.entity.Book;
import com.example.bookstoreapi.mapper.BookMapper;
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
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    // GET: Retrieve all books
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> bookDTOs = new ArrayList<>();
        for (Book book : books) {
            bookDTOs.add(bookMapper.toDTO(book));
        }
        return ResponseEntity.ok(bookDTOs);
    }

    // GET: Retrieve a book by ID
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        if (book.isPresent()) {
            return ResponseEntity.ok(bookMapper.toDTO(book.get()));
        } else {
            throw new ResourceNotFoundException("Book with ID " + id + " not found.");
        }
    }

    // POST: Create a new book
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookMapper.toDTO(book));
    }

    // PUT: Update a book by ID
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<BookDTO> updateBook(@PathVariable Long id, @RequestBody BookDTO updatedBookDTO) {
        Optional<Book> existingBook = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBookDTO.getTitle());
            book.setAuthor(updatedBookDTO.getAuthor());
            book.setPrice(updatedBookDTO.getPrice());
            book.setIsbn(updatedBookDTO.getIsbn());
            return ResponseEntity.ok(bookMapper.toDTO(book));
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
}
