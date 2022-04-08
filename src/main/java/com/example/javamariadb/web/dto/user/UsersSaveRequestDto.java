//package com.example.javamariadb.web.dto.user;
//
//import com.example.javamariadb.user.Users;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@NoArgsConstructor
//public class UsersSaveRequestDto {
//
//    private Long userNoId;
//    private String userName;
//    private String userEmail;
//    private String userPassword;
//    private String ssaId;
//    private String userDept;
//    private String userPosition;
//    private Long companyId;
//
//    @Builder
//    public UsersSaveRequestDto(Long userNoId, String userName, String userEmail, String userPassword,
//                               String ssaId,String userDept, String userPosition, Long companyId) {
//
//        this.userNoId = userNoId;
//        this.userName = userName;
//        this.userEmail = userEmail;
//        this.userPassword = userPassword;
//        this.ssaId = ssaId;
//        this.userDept = userDept;
//        this.userPosition = userPosition;
//        this.companyId = companyId;
//
//    }
//
//    public Users toEntity() {
//        return Users.builder()
//                .userName(userName)
//                .userEmail(userEmail)
//                .userPassword(userPassword)
//                .ssaId(ssaId)
//                .userDept(userDept)
//                .userPosition(userPosition)
//                .companyId(companyId)
//                .build();
//    }
//
//}
