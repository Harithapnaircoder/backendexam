package com.practice.demo.controller;

import com.practice.demo.model.User;
import com.practice.demo.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) { // Changed from Signup to Employee
        // Check if the email already exists in the database
        User existingUser = signupRepository.findByEmail(user.getEmail()); // Changed from Signup to Employee

        if (existingUser != null) {
            // If the email already exists, return a conflict response
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email address already in use");
        } else {
            // Email does not exist, proceed with signup
            signupRepository.save(user); // Changed from Signup to Employee
            return ResponseEntity.ok("Signup successful");
        }
    }
}