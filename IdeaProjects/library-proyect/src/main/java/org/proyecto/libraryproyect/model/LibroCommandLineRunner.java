package org.proyecto.libraryproyect.model;

import org.proyecto.libraryproyect.repository.CategoriaRepository;
import org.proyecto.libraryproyect.repository.LibreriaRepository;
import org.proyecto.libraryproyect.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibroCommandLineRunner implements CommandLineRunner {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private CategoriaRepository CategoriaRepository;

    @Autowired
    private LibreriaRepository libreriaRepository;


    @Override
    public void run(String... args) throws Exception {
        Libro libro = new Libro("El Silmarillion", "J.R.R Tolkien","122345643");
        libreriaRepository.save(libro);
        Categoria categoria = new Categoria(1L, "Fantasia");
        categoria.setNombre("Fantasia");
        CategoriaRepository.save(categoria);
        System.out.println("libro guardado");
    }
}
