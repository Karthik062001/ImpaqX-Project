package com.example.OneToOne3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OneToOne3.Entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	@Query(value = "SELECT j.* from job j JOIN applicant_job aj ON j.job_id = aj.job_id WHERE aj.applicant_id = ?1", nativeQuery = true)
	List<Job> findJobsByApplicantId(int applicantId);
}
