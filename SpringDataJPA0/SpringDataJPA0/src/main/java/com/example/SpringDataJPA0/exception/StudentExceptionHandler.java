package com.example.SpringDataJPA0.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(value = {StudentNotFoundException.class})
    public ResponseEntity<Object> handleStudentNotFound(StudentNotFoundException ex) {
    
    	//Normal inbeult status code error codes
//        StudentException studentException = new StudentException( HttpStatus.NOT_FOUND.value(),ex.getMessage(),LocalDateTime.now());
//    
//        return new ResponseEntity<>(studentException, HttpStatus.NOT_FOUND);
    	
    	
    	//By giving an status code from the developer
    	 StudentException studentException = new StudentException( ex.getStatusCode(),ex.getMessage(),LocalDateTime.now());
       
           return new ResponseEntity<>(studentException, HttpStatus.valueOf(ex.getStatusCode()));
    }
}
