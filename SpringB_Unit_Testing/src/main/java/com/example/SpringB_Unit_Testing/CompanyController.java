package com.example.SpringB_Unit_Testing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/company")
public class CompanyController {

	CompanyService compService;
	
	public CompanyController(CompanyService compService)
	{
		this.compService=compService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Company>> getAll()
	{
		return compService.getAll();
	}
	
	@GetMapping("getone/{id}")
	public Optional<Company> getOne(@PathVariable int id)
	{
		return compService.getOne(id);
	}
	
	@PostMapping("save")
	public ResponseEntity saveCompany(@RequestBody Company comp)
	{
		compService.saveCompany(comp);
		Map<String,String>map=new HashMap();
		map.put("Message", "Row created successfully");
		return new ResponseEntity(map,HttpStatus.CREATED);
	}
	
	@PutMapping("update/{id}")
	public void updateCompany(@PathVariable int id, @RequestBody Company newComp)
	{
		compService.updateComp(id,newComp);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteComp(@PathVariable int id)
	{
		compService.deleteComp(id);
	}
}
