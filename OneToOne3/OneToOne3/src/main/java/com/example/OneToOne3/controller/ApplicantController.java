package com.example.OneToOne3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.service.ApplicantService;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {

	@Autowired
	ApplicantService appserv;

	@PostMapping
	public Applicant saveApp(@RequestBody Applicant app) {
		return appserv.saveApplicant(app);
	}

	@GetMapping("/{id}")
	public Optional<Applicant> getAppli(@PathVariable int id) {
		return appserv.getappli(id);
	}

	@GetMapping
	public List<Applicant> getAllApli()
	{
		return appserv.getAllAppli();
	}
	@PutMapping("/{Applicantid}")
	public ResponseEntity<Applicant> updateAppli(@PathVariable int Applicantid, @RequestBody Applicant app) {
		return appserv.updateAppli(Applicantid, app);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Object>> deleteAppli(@PathVariable int id) {
	    appserv.deleteAppli(id);

	    Map<String, Object> response = new HashMap<>();
	    response.put("message", "Applicant deleted successfully");
	    response.put("StatusCode:", HttpStatus.ACCEPTED.value());
	    
	    return ResponseEntity.ok(response);
	}

}
