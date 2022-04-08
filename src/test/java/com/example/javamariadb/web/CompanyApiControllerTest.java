//package com.example.javamariadb.web;
//import com.example.javamariadb.company.Company;
//import com.example.javamariadb.company.CompanyRepository;
//import com.example.javamariadb.laptopdoor.LaptopDoor;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.sql.Date;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//
//@ExtendWith(MockitoExtension.class)
//public class CompanyApiControllerTest {
//
//    @Mock
//    CompanyRepository companyRepository;
//    @InjectMocks
//    CompanyApiController companyController;
//
//    @Test
//    public void saveNewOpen() {
//        // given
//        Long companyId = 1L;
//        String companyName = "companyName";
//        Double companyAddressLatitude = 1.1;
//        Double companyAddressHardness = 2.2;
//
//        Company company = Company.builder()
//                .companyName(companyName)
//                .companyAddressLatitude(companyAddressLatitude)
//                .companyAddressHardness(companyAddressHardness)
//                .build();
//
//        when(companyRepository.save(any())).thenReturn(company); // Mock 객체 주입
//
//        // when
//        Company result
//                = companyController.createCompany(Company.builder().companyName(companyName).build());
//        // then
//        verify(companyRepository, times(1)).save(any());
//        assertThat(result, equalTo(company));
//    }
//
//}
//
