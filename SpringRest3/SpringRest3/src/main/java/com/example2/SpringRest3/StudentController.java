package com.example2.SpringRest3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService stdsevice;
	
	@GetMapping("/all")
	public List<Student> getAll()
	{
		return stdsevice.get();
	}
	
	@GetMapping("{id}")
	public void getOne(int id)
	{
		stdsevice.get().stream().filter(p->p.getStId()==id).findFirst();
	}
	
	@PostMapping
	public void postdata(@RequestBody Student std)
	{
		stdsevice.post(std);
	}
	
	@PutMapping
	public void putdata(@RequestBody Student std)
	{
		stdsevice.put(std);
	}
	
	@DeleteMapping("{id}")
	public void deleteData(@PathVariable Student std)
	{
		stdsevice.delete(std);
	}
	
	
}
