package org.proyecto.libraryproyect.repository;

import org.proyecto.libraryproyect.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibreriaRepository extends JpaRepository<Libreria, Long> {
}