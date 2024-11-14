package org.proyecto.libraryproyect.controller;

import org.proyecto.libraryproyect.Service.interfaces.UserServiceInterface;
import org.proyecto.libraryproyect.controller.interfaces.UserControllerInterface;
import org.proyecto.libraryproyect.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RESTful API for User management
 */
@RestController
@RequestMapping("/api")
public class UserController implements UserControllerInterface {

    /**
     * User service for accessing user data
     */

    private UserServiceInterface userService;

    /**
     * Get a list of all users
     *
     * @return list of all users
     */
    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /**
     * Save a new user
     *
     * @param user the user to be saved
     */
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
