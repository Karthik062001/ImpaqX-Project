package com.example.SpringB_Unit_Testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;

@DataJpaTest
public class CompanyServiceTest {

	@Mock
	CompanyRepository companyRepository;
	
	@InjectMocks
	CompanyService compService;
	
	@Test
    void getAllReturnListOfCompany() {

        Company company1 = new Company(1,"ImpaqX","87534","Mysore",50);
        Company company2 = new Company(2,"Bosh","98347534","Bengalore",2000);
        
        List<Company> companyList = Arrays.asList(company1, company2);
        ResponseEntity<List<Company>> responseEntity = ResponseEntity.ok(companyList);

//        When condition  there is some execution
        when(companyRepository.findAll()).thenReturn(companyList);

//        Then there will be some answer
        ResponseEntity<List<Company>> data = compService.getAll();
        assertThat(data).isNotNull();
        assertThat(data.getStatusCodeValue()).isEqualTo(200);
        assertThat(data.getBody()).containsExactly(company1, company2);
    }


	
}
