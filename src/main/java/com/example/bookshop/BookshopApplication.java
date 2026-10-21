package com.example.bookshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

    /** Seeds a few rows (persisted through Hibernate) on startup. */
    @Bean
    CommandLineRunner seed(BookRepository repo) {
        return args -> {
            repo.save(new Book("Clean Code", "Robert C. Martin"));
            repo.save(new Book("Effective Java", "Joshua Bloch"));
            repo.save(new Book("Refactoring", "Martin Fowler"));
        };
    }
}
