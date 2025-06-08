package com.example.SpringDataQueryDSLPredicate.service;

import java.util.Optional;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDataQueryDSLPredicate.entity.QUser;
import com.example.SpringDataQueryDSLPredicate.entity.User;
import com.example.SpringDataQueryDSLPredicate.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {


	    @Autowired
	    UserRepository userRepo;

	  
	    public Object saveUser(User user) {
	        return userRepo.save(user);
	    }

	    public Iterable getUsers(String name) {
	    	 
	    	QUser qUser=QUser.user;
	        Predicate predicate = qUser.isNotNull() ;

	        if (name != null) {
	            predicate = qUser.userName.equalsIgnoreCase(name);
	        }

	        return userRepo.findAll(predicate);
	    	
	    }

	    public Iterable getUsersStartsEndsWith(String name)
	    {
	    	QUser user=QUser.user;
	    	Predicate predicate=user.userEmail.startsWith("vijay").and(user.userEmail.endsWith("in"));
	    	return userRepo.findAll(predicate);
	    }
	   
	    public Optional<User> getUserById(Long id) {
	        return userRepo.findById(id);
	    }

	 
	    public void deleteUser(Long id) {
	    	userRepo.deleteById(id);
	    }
	

}
