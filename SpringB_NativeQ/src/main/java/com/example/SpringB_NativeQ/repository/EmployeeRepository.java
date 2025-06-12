package com.example.SpringB_NativeQ.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.SpringB_NativeQ.entity.Employee;
import com.example.SpringB_NativeQ.entity.EmployeeJobDTO;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query(nativeQuery = true,value="select * from employee WHERE emp_salary<:m")
	List<Employee>getEmpWithMaxPrice(@Param("m") Integer maxPrice);
	
	@Query(value = "select e.emp_name as empName, e.emp_salary as empSalary,e.emp_addres as empAddres, j.job_name as jobName from employee e join job j on e.employee_job = j.job_id", nativeQuery = true)
    List<EmployeeJobDTO> fetchEmployeeWithJobDTO();
	
	@Query(value="select * from employee e WHERE emp_salary<=:salary", nativeQuery = true)
	List<Employee> EmpfetchWithMinSalary(@Param("salary")Integer salary);
	
	@Query(nativeQuery = true, value="select e.emp_name as empName, j.job_code as jobCode from employee e join job j on e.employee_job=j.job_id")
	List<Object[]>fetchEmpNameJobCode();

}
