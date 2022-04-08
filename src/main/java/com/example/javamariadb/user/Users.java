//package com.example.javamariadb.user;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//public class Users{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long userNoId;
//
//    @Column(nullable = false)
//    private String userName;
//
//    @Column(nullable = false)
//    private String userEmail;
//
//    @Column(nullable = false)
//    private String userPassword;
//
//    @Column(nullable = false)
//    private String ssaId;
//
//    @Column(nullable = false)
//    private String userDept;
//
//    @Column(nullable = false)
//    private String userPosition;
//
//    @Column(nullable = false)
//    private Long companyId;
//
//    @Builder
//    public Users(String userName, String userEmail, String userPassword,
//                 String ssaId,String userDept, String userPosition, Long companyId) {
//
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
//    @Builder
//    public Users(String userName, String userEmail) {
//
//        this.userName = userName;
//        this.userEmail = userEmail;
//    }
//
//    public Users update(String userName, String userEmail, String userPassword,
//                        String ssaId, String userDept, String userPosition, Long companyId) {
//
//        this.userName = userName;
//        this.userEmail = userEmail;
//        this.userPassword = userPassword;
//        this.ssaId = ssaId;
//        this.userDept = userDept;
//        this.userPosition = userPosition;
//        this.companyId = companyId;
//
//
//        return this;
//    }
//}
//
