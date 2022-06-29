package com.example.springaop.controller;

import com.example.springaop.entity.Book;
import com.example.springaop.service.BookService;
import com.example.springaop.util.CustomResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public CustomResponse<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/books/{title}")
    public CustomResponse<Book> getBookByTittle(@PathVariable("title") String title) {
        return bookService.getBookByTittle(title);
    }

    @PostMapping("/books")
    public CustomResponse<Book> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}
