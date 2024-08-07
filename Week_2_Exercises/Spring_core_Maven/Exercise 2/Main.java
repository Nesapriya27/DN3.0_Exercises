package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context from applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Get the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");
        
        // Call the method to list books, which should demonstrate dependency injection
        bookService.listBooks();
    }
}
