package com.example.SpringBoot_Secuity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
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
@RequestMapping("api/company")
public class CompanyController {

	@Autowired
	CompanyService compService;
	

	public CompanyController(CompanyService compService)
	{
		this.compService=compService;
	}
	
	@GetMapping("/public")
    public ResponseEntity<String> publicEndpoint() {
        return ResponseEntity.ok("This is a public endpoint");
    }
	
	@GetMapping("/all")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Company>> getAll()
	{
		return compService.getAll();
	}
	
	@GetMapping("/{companyId}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Company getOne(@PathVariable int companyId)
	{
		return compService.getOne(companyId);
	}
	
	@PostMapping("/save")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity saveCompany(@RequestBody Company comp)
	{
		compService.saveCompany(comp);
		Map<String,String>map=new HashMap();
		map.put("Message", "Row created successfully");
		return new ResponseEntity(map,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity updateCompany(@PathVariable int id, @RequestBody Company newComp)
	{
		compService.updateComp(id,newComp);
		Map<String,String>map=new HashMap();
		map.put("Message", "Row updated successfully");
		return new ResponseEntity(map,HttpStatus.CREATED);

	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity deleteComp(@PathVariable int id)
	{
		compService.deleteComp(id);
		Map<String,String>map=new HashMap();
		map.put("Message", "Row deleted successfully");
		return new ResponseEntity(map,HttpStatus.NO_CONTENT);

	}
}
