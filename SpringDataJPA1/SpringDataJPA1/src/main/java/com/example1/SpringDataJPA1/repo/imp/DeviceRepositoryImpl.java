package com.example1.SpringDataJPA1.repo.imp;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example1.SpringDataJPA1.entity.Device;
import com.example1.SpringDataJPA1.repo.DeviceRepository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

import jakarta.persistence.EntityManager;

@Primary
public class DeviceRepositoryImpl extends BaseRepoImp<Device, Integer> implements DeviceRepository {

	public DeviceRepositoryImpl( EntityManager entityManager) {
		super(Device.class, entityManager);
		
	}

	@Override
	public Optional<Device> findOne(Predicate predicate) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Iterable<Device> findAll(Predicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Device> findAll(Predicate predicate, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Device> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Device> findAll(OrderSpecifier<?>... orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Device> findAll(Predicate predicate, Pageable pageable) {
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
	public <S extends Device, R> R findBy(Predicate predicate, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
