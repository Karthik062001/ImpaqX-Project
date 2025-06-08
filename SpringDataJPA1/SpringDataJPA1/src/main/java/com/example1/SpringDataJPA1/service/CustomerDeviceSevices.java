package com.example1.SpringDataJPA1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example1.SpringDataJPA1.entity.Customer;
import com.example1.SpringDataJPA1.entity.Device;
import com.example1.SpringDataJPA1.repo.CustomerRepository;
import com.example1.SpringDataJPA1.repo.DeviceRepository;
import com.querydsl.core.types.Predicate;

@Service
public class CustomerDeviceSevices {

	@Autowired
	@Qualifier("deviceRepositoryImpl")
	DeviceRepository devRepo;
	
	@Autowired
	@Qualifier("customerRepositoryImpl")
	CustomerRepository custRepo;
	
	public void saveCustomer(Customer cust)
	{
		if(cust.getDevice()!=null)
		{
			for(Device dev:cust.getDevice())
			{
				dev.setCustomer(cust);
			}
		}
		custRepo.save(cust);
	}
	
	public void saveDevice(Device dev)
	{
		devRepo.save(dev);
	}
	
	public List<Customer> getAllCust()
	{
		return custRepo.findAll();
	}
	
	public List<Device>getAllDevice()
	{
		return devRepo.findAll();
	}
	
	public Optional<Customer> findCustomerByDeviceName(String name)
	{
		return custRepo.findCustomerByDeviceName(name);
		
	}
	
	public List<Customer> getAllCustomerWthFetchJoin()
	{
		return custRepo.getAllCustomerWithFetchJoin();
	}
	
	
}
