package org.proyecto.libraryproyect.repository;

import org.proyecto.libraryproyect.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The RoleRepository interface extends JpaRepository to allow for CRUD operations
 * on Role entities in the database.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Method to find a Role entity by its name field
     *
     * @param name The name of the Role entity to search for
     * @return The found Role entity or null if not found
     */
   org.proyecto.libraryproyect.model.Role findByName(String name);
}
