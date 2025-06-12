package com.example.OneToOne3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.OneToOne3.Entity.Applicant;
import com.example.OneToOne3.Entity.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer>{

	 @Query(value = "select * from resume where resume_id =:id", nativeQuery = true)
	    Resume findResumeById(int id);

	    @Query(value = "select * from resume where applicant_id =:appId", nativeQuery = true)
	    List<Resume> findResumeByApplicantId(@Param("appId") int applicantId);
	    
	    @Query(value="select * from resume order by resume_content")
	    List<Applicant> orderByresumeContent(@Param("resId")int resumeId);
}
