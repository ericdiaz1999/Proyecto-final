package com.example.demo.models;

import com.example.demo.repository.BookRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.GenreRepository;
import com.example.demo.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Component
public class BookCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {


        //FANTASY

        Book book = new Book("the name of the wind", "patrick rockfus", "1234");
        bookRepository.save(book);
        Catregory category = new Catregory(1L, "Fantasy");
        categoryRepository.save(category);
        System.out.println("Saved book");


        Book book1 = new Book(" the silmarillion", " J.R.R Tolkien", "5678");
        bookRepository.save(book1);
        Catregory category1 = new Catregory(1L, "Fantasy");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book2 = new Book("game of thrones", "George R.R. Martin", "8765");
        bookRepository.save(book2);
        Catregory category2 = new Catregory(1L, "Fantasy");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book3 = new Book("blood wings", "Rebecca Yarros", "9101");
        bookRepository.save(book3);
        Catregory category3 = new Catregory(1L, "Fantasy");
        categoryRepository.save(category);
        System.out.println("Saved book");



        //TERROR

        Book book4 = new Book("Carrie", "Stephen King", "1112");
        bookRepository.save(book4);
        Catregory category4 = new Catregory(2L, "Terror");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book5 = new Book("Dracula", " Bram Stoker", "1314");
        bookRepository.save(book5);
        Catregory category5 = new Catregory(2L, "Terror");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book6 = new Book("Don't Wake the Devil", "Raquel Ortega", "1516");
        bookRepository.save(book6);
        Catregory category6 = new Catregory(2L, "Terror");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book7 = new Book("What lives inside", "Malenka Ramos", "1718");
        bookRepository.save(book7);
        Catregory category7 = new Catregory(2L, "Terror");
        categoryRepository.save(category);
        System.out.println("Saved book");



        //MYSTERY

        Book book8 = new Book("Sherlock holmes", "Arthur Conan Doyle", "1920");
        bookRepository.save(book8);
        Catregory category8 = new Catregory(3L, "Mystery");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book9 = new Book("The eternal dream", " Raymond Chandler", "2122");
        bookRepository.save(book9);
        Catregory category9 = new Catregory(3L, "Mystery");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book10 = new Book("The Silent Patient", "Fred Vargas", "2223");
        bookRepository.save(book10);
        Catregory categor10 = new Catregory(3L, "Mystery");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book11 = new Book("The power of the dog", " Don Winslow", "2324");
        bookRepository.save(book11);
        Catregory category11 = new Catregory(3L, "Mystery");
        categoryRepository.save(category);
        System.out.println("Saved book");



        //SCIENCE FICTION

        Book book12 = new Book("Takarabune", "Sabino Cabeza Abuín", "2526");
        bookRepository.save(book12);
        Catregory category12 = new Catregory(4L, "Science fiction");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book13 = new Book("Grey", "Carlos Sisí", "2728");
        bookRepository.save(book13);
        Catregory category13 = new Catregory(4L, "Science fiction");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book14 = new Book("Metro 2033", "Dmitry Glukhovsky", "2930");
        bookRepository.save(book14);
        Catregory category14 = new Catregory(4L, "Science fiction");
        categoryRepository.save(category);
        System.out.println("Saved book");

        Book book15 = new Book("Mickey7", " Edward Ashton", "3132");
        bookRepository.save(book15);
        Catregory category15 = new Catregory(4L, "Science fiction");
        categoryRepository.save(category);
        System.out.println("Saved book");









    }
}





