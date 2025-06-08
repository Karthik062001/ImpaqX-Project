package com.example.OneToOne2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToOne2.entity.Applicant;

public interface ApplicationRepository extends JpaRepository<Applicant, Integer>{

}
