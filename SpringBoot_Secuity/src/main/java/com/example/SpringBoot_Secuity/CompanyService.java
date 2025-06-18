package com.example.SpringBoot_Secuity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository compRepo;
	
	@Autowired
	PasswordEncoder encoder;
	
	
	public CompanyService(CompanyRepository compRepo)
	{
		this.compRepo=compRepo;
	}

	public ResponseEntity<List<Company>> getAll() {
	
		List<Company> data = compRepo.findAll();
		return new ResponseEntity(data,HttpStatus.OK);
	}

	public Company getOne(int id) {
		
		return compRepo.findById(id).get()	;
	}

	public Company saveCompany(Company comp) {
		return compRepo.save(comp);
		
	}

	public void updateComp(int id, Company newComp) {
		Optional<Company> comp = compRepo.findById(id);
		if(comp!=null) {
			Company existComp = comp.get();
			existComp.setCompanyCode(newComp.getCompanyCode());
			existComp.setCompanyEmployees(newComp.getCompanyEmployees());
			existComp.setCompanyLocation(newComp.getCompanyLocation());
			existComp.setCompanyName(newComp.getCompanyName());
			compRepo.save(existComp);
		}
	
		
	}

	public void deleteComp(int id) {
		compRepo.deleteById(id);
		
	}
}
