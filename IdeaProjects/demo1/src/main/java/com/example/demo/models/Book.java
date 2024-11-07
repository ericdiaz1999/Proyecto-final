package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "books")
@Getter
@Setter
@Entity
public class Book extends Library {

    private String title;
    private String author;
    private String isbn;

    public Book(Long id, String name, String adress, String title, String author, String isbn) {
        super(id, name, adress);
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book() {
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;


    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}



