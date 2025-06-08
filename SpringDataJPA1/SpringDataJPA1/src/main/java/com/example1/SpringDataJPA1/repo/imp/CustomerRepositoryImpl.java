package com.example1.SpringDataJPA1.repo.imp;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example1.SpringDataJPA1.entity.Customer;
import com.example1.SpringDataJPA1.repo.CustomerRepository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;

public class CustomerRepositoryImpl extends BaseRepoImp<Customer, Integer>implements CustomerRepository{

	public CustomerRepositoryImpl( EntityManager entityManager) {
		super(Customer.class, entityManager);
		
	}

	@Override
	public Optional<Customer> findCustomerByDeviceName(String name) {
		
		return Optional.ofNullable(
		        jpaFactory.select(customer)
		        .from(customer)
		        .join(customer.device, device)
		        .where(device.dName.equalsIgnoreCase(name))
		        .fetchFirst()
		    );	}

	@Override
	public List<Customer> getAllCustomerWithFetchJoin() {
		
		return jpaFactory.select(customer)
				.distinct().from(customer)
				.innerJoin(customer.device,device)
				.fetchJoin().fetch();
	}

	@Override
	public Optional<Customer> findOne(Predicate predicate) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Iterable<Customer> findAll(Predicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAll(Predicate predicate, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAll(OrderSpecifier<?>... orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findAll(Predicate predicate, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Predicate predicate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists(Predicate predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Customer, R> R findBy(Predicate predicate, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
