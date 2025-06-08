package com.example.OneToOne3.repository;

import org.hibernate.sql.exec.spi.JdbcOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.support.JdbcAccessor;

import com.example.OneToOne3.Entity.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{


}
