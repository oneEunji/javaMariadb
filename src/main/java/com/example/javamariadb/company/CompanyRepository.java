//package com.example.javamariadb.company;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface CompanyRepository extends JpaRepository<Company, Long> {
//
//    @Query("SELECT c FROM Company c ORDER BY c.companyId DESC")
//    List<Company> findAllDesc();
//
////    Company findByCompanyId(Long companyId);
//
//    Company save(Company company);
//
//    Company createCompany(Company company);
//}