package com.example.SpringDataJPA0.service;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.SpringDataJPA0.entity.Student;
import com.example.SpringDataJPA0.exception.StudentNotFoundException;
import com.example.SpringDataJPA0.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepo;
	
	public StudentService(StudentRepository studentRepo)
	{
		this.studentRepo=studentRepo;
	}
	
	public Student addStudent(Student std)
	{
		return studentRepo.save(std);
	}
	
	public List<Student> getAll()
	{
		return studentRepo.findAll();
	}

	public Optional<Student> geton(int id) throws StubNotFoundException
	{
		if(studentRepo.findById(id).isEmpty())
		{
			throw new StudentNotFoundException("Requestinf data is not present",405);
		}
		return studentRepo.findById(id);
		
	}
	public Student update(int std,Student newdata) throws Exception 
	{
		Optional<Student> olddata=studentRepo.findById(std);
		if(olddata!=null)
		{
			Student data = olddata.get();
			data.setFirstName(newdata.getFirstName());
			data.setEmailId(newdata.getEmailId());
			data.setLastName(newdata.getLastName());
			data.setStudentId(newdata.getStudentId());
			data.setGardianMob(newdata.getGardianMob());
			data.setGardianName(newdata.getGardianName());
			return studentRepo.save(data);
		}
		else
		{
			throw new Exception("Student not found");
		}	
	}
	public void delete(int id)
	{
		studentRepo.deleteById(id);
	}

	public List<Student> getMany(List<Integer> id) {
		
		return studentRepo.findAllById(id);
		
	}

	
	
}
