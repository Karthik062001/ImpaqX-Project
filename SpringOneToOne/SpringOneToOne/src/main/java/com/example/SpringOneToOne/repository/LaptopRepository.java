package com.example.SpringOneToOne.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringOneToOne.entity.Laptop;

public interface LaptopRepository extends CrudRepository<Laptop, Integer>,QuerydslPredicateExecutor{

}
