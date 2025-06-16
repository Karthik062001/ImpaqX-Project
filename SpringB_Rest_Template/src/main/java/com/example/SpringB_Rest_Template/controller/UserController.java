package com.example.SpringB_Rest_Template.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.SpringB_Rest_Template.entity.User;
import com.example.SpringB_Rest_Template.repository.UserRepository;

@RestController
@RequestMapping("/api/newuser")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/save")
    public ResponseEntity<Map<String, Object>> saveUser(@RequestBody User user) {
        userRepo.save(user);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "User saved successfully");
        response.put("user", user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getUserById(@PathVariable int id) {
        Optional<User> data = userRepo.findById(id);
        Map<String, Object> response = new HashMap<>();
        if (data.isPresent()) {
            response.put("message", "User found");
            response.put("user", data.get());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "User with ID " + id + " not found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAllUsers() {
        List<User> users = userRepo.findAll();
        Map<String, Object> response = new HashMap<>();
        response.put("message", "All users retrieved");
        response.put("users", users);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateUser(@PathVariable int id, @RequestBody User newUser) {
        Optional<User> existingUser = userRepo.findById(id);
        Map<String, Object> response = new HashMap<>();
        if (existingUser.isPresent()) {
            User exUser = existingUser.get();
            exUser.setUserEmail(newUser.getUserEmail());
            exUser.setUserName(newUser.getUserName());
            userRepo.save(exUser);
            response.put("message", "User updated successfully");
            response.put("user", exUser);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "User with ID " + id + " not found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{userid}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable int userid) {
        Optional<User> userOpt = userRepo.findById(userid);
        Map<String, Object> response = new HashMap<>();
        if (userOpt.isPresent()) {
            userRepo.deleteById(userid);
            response.put("message", "User deleted successfully");
            response.put("deletedUserId", userid);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        } else {
            response.put("message", "User with ID " + userid + " not found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
