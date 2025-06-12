package com.example.SpringB_NativeQ.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringB_NativeQ.entity.Employee;
import com.example.SpringB_NativeQ.entity.EmployeeJobDTO;
import com.example.SpringB_NativeQ.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	EmployeeService empService;
	
	@Autowired
	public EmployeeController(EmployeeService empService)
	{
		this.empService=empService;
	}
	
	private static final Logger log=LogManager.getLogger(EmployeeController.class);
	
	@GetMapping
	public List<Employee> getAllEmp()
	{
		return empService.getAllEmp();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getOneEmp(@PathVariable int id)
	{
		return empService.getOneEmp(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Map<String,Object>> saveEmp(@RequestBody Employee emp)
	{
		empService.saveEmp(emp);
		log.info("saved the employee "+emp);
		Map<String,Object> response=new HashMap<String, Object>();
		response.put("message:", "Employee saved successfully");
		response.put("StatusCode:", HttpStatus.OK.value());
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String,Object>>deleteEmp(@PathVariable int id)
	{
		empService.deleteEmp(id);
		log.info("deleted the  employee "+id);
		Map<String,Object> response=new HashMap<String, Object>();
		response.put("message", "Employee "+id+" deleted succesfully");
		response.put("StatusCode", HttpStatus.ACCEPTED.value());
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/emp-max-price")
	public List<Employee>getEmpWithMaxPrice(@RequestParam Integer maxPrice)
	{
		return empService.getEmpWithMaxPrice(maxPrice);
	}
	
	@GetMapping("/with-job")
	public List<EmployeeJobDTO> getEmployeesWithJob() {
	    return empService.fetchEmployeeWithJob();
	}

	@GetMapping("/min-salary")
	public List<Employee> EmpfetchWithMinSalary(@RequestParam int salary)
	{
		return empService.EmpfetchWithMinSalary(salary);
	}
	
	@GetMapping("/fetchEmp-and-Job")
	public 	List<Map<String,Object>>fetchEmpNameJobCode()
	{
		return empService.fetchEmpNameJobCode();
	}
}
