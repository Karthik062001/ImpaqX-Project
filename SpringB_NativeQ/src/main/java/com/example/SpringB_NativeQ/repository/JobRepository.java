package com.example.SpringB_NativeQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringB_NativeQ.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{

}
