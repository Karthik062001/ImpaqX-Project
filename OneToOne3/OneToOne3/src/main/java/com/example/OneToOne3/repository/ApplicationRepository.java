package com.example.OneToOne3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToOne3.Entity.Applications;

public interface ApplicationRepository extends JpaRepository<Applications, Integer> {

}
