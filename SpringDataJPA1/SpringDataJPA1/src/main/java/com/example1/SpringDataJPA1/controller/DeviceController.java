package com.example1.SpringDataJPA1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.SpringDataJPA1.entity.Customer;
import com.example1.SpringDataJPA1.entity.Device;
import com.example1.SpringDataJPA1.service.CustomerDeviceSevices;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@Autowired
	CustomerDeviceSevices service;
	
	@PostMapping("/customer")
	public void saveCustomer(@RequestBody Customer cust)
	{
		service.saveCustomer(cust);
	}
	@PostMapping("/device")
	public void saveDevice(@RequestBody Device dev)
	{
		service.saveDevice(dev);
	}
	@GetMapping("/customer")
	public List<Customer> getAllCust()
	{
		return service.getAllCust();
		
	}
	@GetMapping("/device")
	public List<Device>getAllDevice()
	{
		return service.getAllDevice();
	}
	@GetMapping("/customer/{name}")
	public Optional<Customer> findCustomerByDeviceName(@PathVariable String name)
	{
		return service.findCustomerByDeviceName(name);
	}
	
	@GetMapping("/customer/fetchjoin")
	public List<Customer> getAllCustomerWthFetchJoin()
	{
		return service.getAllCustomerWthFetchJoin();
	}
}
