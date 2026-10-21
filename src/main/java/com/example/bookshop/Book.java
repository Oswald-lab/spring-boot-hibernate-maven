package com.example.bookshop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    @CreationTimestamp               // Hibernate-specific annotation
    private Instant createdAt;

    protected Book() {}              // required by JPA/Hibernate

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public Instant getCreatedAt() { return createdAt; }
}
