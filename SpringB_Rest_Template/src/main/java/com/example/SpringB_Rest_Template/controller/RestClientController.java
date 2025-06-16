package com.example.SpringB_Rest_Template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.SpringB_Rest_Template.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/rest-client")
public class RestClientController {

    @Autowired
    RestClient restclient;

    @GetMapping("/getAll")
    public ResponseEntity<String> callAllUser() {
        return restclient.callAllUSer();
    }

    @GetMapping("/getall")
    public ResponseEntity<String> callAllUsers() {
        return restclient.callAllUsers();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getOneUser(@PathVariable int id) {
        Object response = restclient.getOneUser(id);
        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            Map<String, String> msg = new HashMap<>();
            msg.put("message", "User with ID " + id + " not found");
            return new ResponseEntity<>(msg, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/post")
    public ResponseEntity<Object> postUser(@RequestBody User user) {
        Object response = restclient.postUser(user);
        Map<String, Object> result = new HashMap<>();
        result.put("message", "User created successfully");
        result.put("user", response);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable int id, @RequestBody User newUser) {
        boolean updated = restclient.updateUser(id, newUser);
        Map<String, String> result = new HashMap<>();
        if (updated) {
            result.put("message", "User updated successfully");
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            result.put("message", "User with ID " + id + " not found");
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable int id) {
        boolean deleted = restclient.deleteUser(id);
        Map<String, String> result = new HashMap<>();
        if (deleted) {
            result.put("message", "User deleted successfully");
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        } else {
            result.put("message", "User with ID " + id + " not found");
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }
}
