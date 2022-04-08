//package com.example.javamariadb.service.company;
//
//import com.example.javamariadb.company.Company;
//import com.example.javamariadb.company.CompanyRepository;
//import com.example.javamariadb.web.dto.company.CompanyListResponseDto;
//import com.example.javamariadb.web.dto.company.CompanyResponseDto;
//import com.example.javamariadb.web.dto.company.CompanySaveRequestDto;
//import com.example.javamariadb.web.dto.company.CompanyUpdateRequestDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RequiredArgsConstructor
//@Service
//public class CompanyService{
//    private final CompanyRepository companyRepository;
//
//    @Transactional
//    public Long save(CompanySaveRequestDto requestDto) {
//        return companyRepository.save(requestDto.toEntity()).getCompanyId();
//    }
//
//    @Transactional
//    public Long update(Long companyId, CompanyUpdateRequestDto requestDto) {
//        Company company = companyRepository.findById(companyId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 회사번호가 없습니다. companyId=" + companyId));
//
//                 company.update(requestDto.getCompanyName(),requestDto.getCompanyAddressLatitude(),requestDto.getCompanyAddressHardness());
//
//        return companyId;
//    }
//
//    @Transactional
//    public Long delete (Long companyId) {
//        Company company = companyRepository.findById(companyId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 회사번호가 없습니다. companyId=" + companyId));
//
//        companyRepository.delete(company);
//        return companyId;
//    }
//
//    @Transactional(readOnly = true)
//    public CompanyResponseDto findById(Long companyId) {
//        Company entity = companyRepository.findById(companyId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 회사번호가 없습니다. companyId=" + companyId));
//
//        return new CompanyResponseDto(entity);
//    }
//
//    @Transactional(readOnly = true)
//    public List<CompanyListResponseDto> findAllDesc() {
//        return companyRepository.findAllDesc().stream()
//                .map(CompanyListResponseDto::new)
//                .collect(Collectors.toList());
//    }
//
//    public Company create(Company company) {
//        return companyRepository.createCompany(company);
//    }
//}
