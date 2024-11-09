package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "book_id" , referencedColumnName = "id")
    private Book book;

    public User(Long id, String name, String email, String username, String password, Book book) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.book = book;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", book=" + book +
                '}';
    }

    public void setBook(Book book) {

    }
}

