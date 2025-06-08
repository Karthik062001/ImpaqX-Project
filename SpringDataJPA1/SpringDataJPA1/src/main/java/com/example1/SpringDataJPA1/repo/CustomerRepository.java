package com.example1.SpringDataJPA1.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example1.SpringDataJPA1.entity.Customer;

public interface CustomerRepository extends BaseRepo<Customer, Integer>{

	public Optional<Customer>findCustomerByDeviceName(String name);
	
	public List<Customer>getAllCustomerWithFetchJoin();
	
	
	
}
