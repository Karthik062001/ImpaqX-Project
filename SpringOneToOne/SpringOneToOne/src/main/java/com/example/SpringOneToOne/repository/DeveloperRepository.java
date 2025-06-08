package com.example.SpringOneToOne.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringOneToOne.entity.Developer;

public interface DeveloperRepository  extends CrudRepository<Developer, Integer>,QuerydslPredicateExecutor<Developer>{

}
