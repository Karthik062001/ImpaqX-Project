package com.example.SpringDataJPA0.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJPA0.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
