package com.example.bookshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookshopApplicationTests {

    @Autowired
    BookRepository repo;

    @Test
    void seededBooksAreStoredByHibernate() {
        assertEquals(3, repo.count());
        assertEquals(1, repo.findByAuthorContainingIgnoreCase("bloch").size());
    }
}
