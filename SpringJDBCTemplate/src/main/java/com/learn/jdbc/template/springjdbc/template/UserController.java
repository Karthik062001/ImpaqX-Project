package com.learn.jdbc.template.springjdbc.template;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserRepository userRepo;

	
	@PostMapping("/insert")
	public Map<String, String> Insert(@RequestBody User user)
	{
		return userRepo.Insert(user);
	}
	
	@GetMapping("/{id}")
	public List<User> getUserById(@PathVariable int id)
	{
		return userRepo.getUserById(id);
	}
	
	@PutMapping
	public Map<String, String> updateUser(@RequestBody User user)
	{
		return userRepo.updateUser(user);
	}
	
	@GetMapping("/all")
	public List<User>getAllUsers()
	{
		return userRepo.getAllUsers();
	}
	
	@GetMapping("/name/{userId}")
	public List<Map<String, Object>> getNameById(@PathVariable int userId)
	{
		return userRepo.getNameById(userId);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, String> deleteUser(@PathVariable int id)
	{
		return userRepo.deleteUser(id);
	}
}
