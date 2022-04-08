//package com.example.javamariadb.web.dto.company;
//
//import com.example.javamariadb.company.Company;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@NoArgsConstructor
//public class CompanySaveRequestDto {
//    private String companyName;
//    private Double companyAddressLatitude;
//    private Double companyAddressHardness;
//
//    @Builder
//    public CompanySaveRequestDto(String companyName, Double companyAddressLatitude, Double companyAddressHardness) {
//        this.companyName = companyName;
//        this.companyAddressLatitude = companyAddressLatitude;
//        this.companyAddressHardness = companyAddressHardness;
//    }
//
//    public Company toEntity() {
//        return Company.builder()
//                .companyName(companyName)
//                .companyAddressLatitude(companyAddressLatitude)
//                .companyAddressHardness(companyAddressHardness)
//                .build();
//    }
//}
