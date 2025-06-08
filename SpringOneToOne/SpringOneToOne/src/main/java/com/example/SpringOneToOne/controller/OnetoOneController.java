package com.example.SpringOneToOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringOneToOne.entity.Developer;
import com.example.SpringOneToOne.entity.Laptop;
import com.example.SpringOneToOne.service.OnetoOneService;

@RestController
@RequestMapping("/api/one2one")
public class OnetoOneController {

	@Autowired
	OnetoOneService service;
	
	@PostMapping("/dev")
	public void postDev(@RequestBody Developer dev)
	{
		service.createDeveloper(dev);
	}
	
	@PostMapping("/lap")
	public ResponseEntity<Laptop> saveLaptop(@RequestBody Laptop lap)
	{
		 return service.saveLaptop(lap);
	}
	@PostMapping("/{dev_lap}/laptop")
	public  Laptop saveLaptop(@PathVariable int dev_lap, @RequestBody Laptop lap)
	{
		return service.addLaptop(dev_lap,lap);
	}
	@GetMapping
	public Iterable<Developer> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/dev")
	public Iterable<Developer> getData(@PathVariable Developer id)
	{
		return service.getDeveloper(id);
	}
}
