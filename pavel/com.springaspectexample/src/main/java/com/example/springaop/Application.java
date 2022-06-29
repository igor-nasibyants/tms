package com.example.springaop;

import com.example.springaop.entity.Book;
import com.example.springaop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private final BookRepository bookRepository;

    public Application(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        Book book1 = new Book("Война и мир", "Л. Н. Толстой");
        Book book2 = new Book("Капитанская дочка", "А. С. Пушкин");

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
