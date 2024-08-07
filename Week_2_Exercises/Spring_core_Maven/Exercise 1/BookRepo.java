package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public void listBooks() {
        List<String> books = Arrays.asList("Book1", "Book2", "Book3");
        books.forEach(System.out::println);
    }
}
