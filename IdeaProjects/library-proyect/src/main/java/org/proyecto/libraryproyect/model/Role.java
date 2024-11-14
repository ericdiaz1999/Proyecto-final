package org.proyecto.libraryproyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Entity class for representing a Role in the database
 */
@Entity
@Data // it has getters, setters, equals, hashcode, toString...
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // getters, setters, constructors, toString, equals, hashCode not needed thanks to lombok ;)
}
