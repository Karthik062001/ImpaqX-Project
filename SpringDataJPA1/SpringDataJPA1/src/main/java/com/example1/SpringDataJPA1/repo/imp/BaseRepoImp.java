package com.example1.SpringDataJPA1.repo.imp;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.example1.SpringDataJPA1.entity.QCustomer;
import com.example1.SpringDataJPA1.entity.QDevice;
import com.example1.SpringDataJPA1.repo.BaseRepo;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;

public abstract class  BaseRepoImp<T,ID> extends SimpleJpaRepository<T,ID> implements BaseRepo<T, ID>{

	EntityManager entityManager;
	JPAQueryFactory jpaFactory;
	
	protected final QCustomer customer=QCustomer.customer;
	protected final QDevice device=QDevice.device;
	
	public BaseRepoImp(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.entityManager=entityManager;
		this.jpaFactory=new JPAQueryFactory(entityManager);
		
	}

	
	public T findByIdMandotary(ID id) throws IllegalArgumentException {
		
		return findById(id).orElseThrow(()->new IllegalArgumentException("Entity not found with id"+id));
	}

	
	


	

}
