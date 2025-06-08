package com.example.OneToOne2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToOne2.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {

}
