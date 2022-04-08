//package com.example.javamariadb.web;
//
//import com.example.javamariadb.company.Company;
//import com.example.javamariadb.company.CompanyRepository;
//import com.example.javamariadb.service.company.CompanyService;
//import com.example.javamariadb.web.dto.company.CompanyListResponseDto;
//import com.example.javamariadb.web.dto.company.CompanyResponseDto;
//import com.example.javamariadb.web.dto.company.CompanySaveRequestDto;
//import com.example.javamariadb.web.dto.company.CompanyUpdateRequestDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//public class CompanyApiController {
//
//    private final CompanyService companyService;
//
//    private final CompanyRepository companyRepository;
//
//    @PostMapping("/company")
//    public Long saveCompany(@RequestBody CompanySaveRequestDto requestDto) {
//        return companyService.save(requestDto);
//    }
//
//    @PutMapping("/company/{companyId}")
//    public Long updateCompany(@PathVariable Long companyId, @RequestBody CompanyUpdateRequestDto requestDto) {
//        return companyService.update(companyId, requestDto);
//    }
//    @DeleteMapping("/company/{companyId}")
//    public Long deleteCompany(@PathVariable Long companyId) {
//        companyService.delete(companyId);
//        return companyId;
//    }
//
//    @GetMapping("/company/{companyId}")
//    public CompanyResponseDto findByCompanyId(@PathVariable Long companyId) {
//        return companyService.findById(companyId);
//    }
//
//    @GetMapping("/company/list")
//    public List<CompanyListResponseDto> findAllCompany() {
//        return companyService.findAllDesc();
//    }
//
//    public Company createCompany(Company company) {
//        if (company.getCompanyName().isEmpty()) {
//            return null;
//        }
//        return companyRepository.save(company);
//    }
//}