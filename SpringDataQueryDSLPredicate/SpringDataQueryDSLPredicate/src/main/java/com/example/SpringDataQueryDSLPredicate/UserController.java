package com.example.SpringDataQueryDSLPredicate;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataQueryDSLPredicate.entity.User;
import com.example.SpringDataQueryDSLPredicate.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	     @Autowired
	     UserService userService;

	    @PostMapping
	    public Object saveUser(@RequestBody User user) {
	        return userService.saveUser(user);
	    }

	    @GetMapping
	    public Iterable getUsers(@RequestParam(required = false) String name) {
	        return userService.getUsers(name);
	    }
	    
	    @GetMapping("/email")
	    public Iterable getUserEmail(@RequestParam(required = false) String name)
	    {
	    	return userService.getUsersStartsEndsWith(name);
	    }

	    @GetMapping("/{id}")
	    public User getUserById(@PathVariable Long id) {
	        return userService.getUserById(id)
	                          .orElseThrow(() -> new RuntimeException("User not found"));
	    }

	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	    }
	

}
