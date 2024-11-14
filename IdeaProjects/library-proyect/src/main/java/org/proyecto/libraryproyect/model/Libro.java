package org.proyecto.libraryproyect.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("LIBRO")

public class Libro extends Libreria {

    private String titulo;
    private String autor;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Libro(Long id, String nombre, String direccion, String titulo, String autor, String isbn) {
        super(id, nombre, direccion);
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", categoria=" + (categoria != null ? categoria.getNombre() : "null") +
                '}';
    }
}