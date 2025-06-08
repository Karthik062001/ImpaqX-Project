package com.example.SpringDataQueryDSLPredicate.repository;


import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringDataQueryDSLPredicate.entity.User;

public interface UserRepository<T> extends CrudRepository<User, Long>, QuerydslPredicateExecutor<User>{



	
	
}
