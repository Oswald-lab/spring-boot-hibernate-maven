package com.example.bookshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repo;

    public BookController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Book> list(@RequestParam(required = false) String author) {
        return author == null ? repo.findAll() : repo.findByAuthorContainingIgnoreCase(author);
    }
}
