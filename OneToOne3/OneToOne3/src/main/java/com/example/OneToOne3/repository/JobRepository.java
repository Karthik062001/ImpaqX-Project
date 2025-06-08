package com.example.OneToOne3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToOne3.Entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
