package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to demonstrate functionality
    public void listBooks() {
        System.out.println("Listing books...");
        bookRepository.findAll();
    }
}
