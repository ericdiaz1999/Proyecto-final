package org.proyecto.libraryproyect.controller;


import org.proyecto.libraryproyect.model.Libro;
import org.proyecto.libraryproyect.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable("id") Long id) {
        Optional<Libro> optionalLibro = libroRepository.findById(id);
        if (optionalLibro.isPresent()) {
            Libro foundLibro = optionalLibro.get();
            return ResponseEntity.ok(optionalLibro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Libro>
    createBook(@RequestBody Libro libro) {
        Libro savedBook = libroRepository.save(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro>
    updateBook(@PathVariable Long id, @RequestBody Libro book) {
        Optional<Libro> bookOptional = libroRepository.findById(id);

        if (bookOptional.isPresent()) {
            Libro Book = bookOptional.get();
            book.setAutor(book.getAutor());
            book.setTitulo(book.getTitulo());

           libroRepository.save(book);
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}/author")
    public ResponseEntity<Libro>
    updateBookAuthor(@PathVariable Long id, @RequestBody String newAuthor) {
        Optional<Libro> bookOptional = libroRepository.findById(id);

        if (bookOptional.isPresent()) {
           Libro libro = bookOptional.get();
           libro.setAutor(newAuthor);

            libroRepository.save(libro);
            return ResponseEntity.ok(libro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Libro>
    deleteBook(@PathVariable Long id) {
        Optional<Libro> bookOptional = libroRepository.findById(id);

        if (bookOptional.isPresent()) {
            libroRepository.delete(bookOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
