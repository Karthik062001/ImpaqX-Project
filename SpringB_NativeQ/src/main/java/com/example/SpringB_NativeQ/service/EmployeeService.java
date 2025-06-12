package com.example.SpringB_NativeQ.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringB_NativeQ.entity.Employee;
import com.example.SpringB_NativeQ.entity.EmployeeJobDTO;
import com.example.SpringB_NativeQ.entity.Job;
import com.example.SpringB_NativeQ.repository.EmployeeRepository;
import com.example.SpringB_NativeQ.repository.JobRepository;

@Service
public class EmployeeService {

	EmployeeRepository empRepo;
	
	JobRepository jobrepo;
	

	@Autowired
	public EmployeeService(EmployeeRepository empRepo,JobRepository jobrepo) {
		this.empRepo=empRepo;
		this.jobrepo=jobrepo;
	}

	public List<Employee> getAllEmp() {
		
		return empRepo.findAll();
	}

	public Optional<Employee> getOneEmp(int id) {
		
		return empRepo.findById(id);
	}

	public Employee saveEmp(Employee emp) {
		
		return empRepo.save(emp);
		
	}

	public void deleteEmp(int id) {
		
		empRepo.deleteById(id);
	}
	
	public List<Employee>getEmpWithMaxPrice(Integer maxPrice)
	{
		return empRepo.getEmpWithMaxPrice(maxPrice);
	}
	
	public List<EmployeeJobDTO> fetchEmployeeWithJob() {
	    return empRepo.fetchEmployeeWithJobDTO();
	}

	public List<Employee> EmpfetchWithMinSalary(int salary) {
		
		return empRepo.EmpfetchWithMinSalary(salary);
	
	}

	public List<Map<String, Object>> fetchEmpNameJobCode() {
		
		List<Object[]> data=empRepo.fetchEmpNameJobCode();
		
		List<Map<String, Object>> result = new ArrayList<>();
		for(Object[] row:data)
		{
			Map<String,Object> map = new HashMap<>();
			map.put("empName", row[0]);
			map.put("jobCode", row[1]);
			result.add(map);
		}
		return result;
	}

	

}
