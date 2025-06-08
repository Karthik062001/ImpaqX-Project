package com.example1.SpringDataJPA1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<T,ID> extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T>{

	T findByIdMandotary(ID id) throws IllegalArgumentException;
}
