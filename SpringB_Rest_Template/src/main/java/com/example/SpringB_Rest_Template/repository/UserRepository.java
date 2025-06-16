package com.example.SpringB_Rest_Template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringB_Rest_Template.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
