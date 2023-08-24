package com.rodneybarbati.StateEmploymentSubmission.controllers;


import com.rodneybarbati.StateEmploymentSubmission.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    CrudRepository<User, Integer> userRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }

}
