package com.example.SpringOneToOne.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SpringOneToOne.entity.Developer;
import com.example.SpringOneToOne.entity.Laptop;
import com.example.SpringOneToOne.entity.QDeveloper;
import com.example.SpringOneToOne.repository.DeveloperRepository;
import com.example.SpringOneToOne.repository.LaptopRepository;
import com.querydsl.core.types.Predicate;

@Service
public class OnetoOneService {

	@Autowired
	DeveloperRepository devRepo;
	
	@Autowired
	LaptopRepository lapRepo;
	
	public ResponseEntity<Developer> createDeveloper(Developer developer) {
	    Developer save = devRepo.save(developer);
	    return ResponseEntity.ok(save);
	}
	
	public ResponseEntity<Laptop> saveLaptop(Laptop lap)
	{
		Laptop save=lapRepo.save(lap);
		return ResponseEntity.ok(lap);
	}

	public Iterable<Developer> getDeveloper(Developer id) {
		
		QDeveloper developer=QDeveloper.developer;
		Predicate predicate=developer.eq(id);
		return devRepo.findAll(predicate);
	}

	public Iterable<Developer> getAll() {
		
		return devRepo.findAll();
	}

	public Laptop addLaptop(int dev_lap, Laptop lap) {
		
		Optional<Developer> dev=devRepo.findById(dev_lap);
		if(dev.isPresent())
		{
			Developer developer=dev.get();
			lap.setDeveloper(developer);
			return lapRepo.save(lap);
		}
		else
		{
			throw new RuntimeException("Developer Not found "+ dev_lap);
		}
	
	}

	
	
	
}
