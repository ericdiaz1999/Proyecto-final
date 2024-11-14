package org.proyecto.libraryproyect.controller.interfaces;

import org.proyecto.libraryproyect.model.User;

import java.util.List;

/**
 * Interface for UserController. Contains methods for handling user related operations
 */
public interface UserControllerInterface {

    /**
     * Retrieves a list of all users
     *
     * @return list of all users
     */
    List<User> getUsers();

    /**
     * Saves a new user
     *
     * @param user the user to be saved
     */
    void saveUser(User user);
}
