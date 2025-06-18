package com.example.SpringB_Unit_Testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class CompanyControllerTest {

//	given - when - then - answer
    @Mock
    private CompanyService companyService;

    @InjectMocks
    private CompanyController companyController;

    @Test
    void getAllShouldReturnListOfCompanies() {
//    	given
        Company company1 = new Company(1, "ImpaqX", "123", "Mysore", 10);
        Company company2 = new Company(2, "L&T", "456", "HAssan", 20);
        List<Company> companies = Arrays.asList(company1, company2);
//        when
        when(companyService.getAll()).thenReturn(ResponseEntity.ok(companies));

        ResponseEntity<List<Company>> response = companyController.getAll();

        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).containsExactly(company1, company2);
    }

    @Test
    void saveCompanyShouldReturnCreatedStatus() {
        Company company = new Company(3, "Capgemini", "78452659", "Bengaluru", 100);
        when(companyService.saveCompany(company)).thenReturn(company);

        ResponseEntity<?> response = companyController.saveCompany(company);

        assertThat(response.getStatusCodeValue()).isEqualTo(201);
       
    }

    @Test
    void getOneShouldReturnCompanyById() {
        Company company = new Company(4, "IBM", "11450831", "Hydarabad", 99);
        when(companyService.getOne(4)).thenReturn(Optional.of(company));

        Optional<Company> result = companyController.getOne(4);

        assertThat(result).isPresent();
        assertThat(result.get().getCompanyName()).isEqualTo("IBM");
    }

    @Test
    void updateCompanyShouldCallServiceUpdateMethod() {
        Company updatedCompany = new Company(5, "Microsoft", "9998429", "Bengaluru", 5040);

        companyController.updateCompany(5, updatedCompany);

        Mockito.verify(companyService).updateComp(5, updatedCompany);
    }

    @Test
    void deleteCompanyShouldCallServiceDeleteMethod() {
        companyController.deleteComp(6);

        Mockito.verify(companyService).deleteComp(6);
    }
}
