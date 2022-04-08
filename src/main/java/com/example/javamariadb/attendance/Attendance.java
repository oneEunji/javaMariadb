//package com.example.javamariadb.attendance;
//
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
//public class Attendance {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long attendanceId;
//
//    @Column(length = 500, nullable = false)
//    private Long userNoId;
//
//    @Column(length = 500, nullable = false)
//    private String ssaId;
//
//    @Column(length = 500, nullable = false)
//    private Long companyId;
//
//    @Column(length = 500, nullable = false)
//    private String attendanceOX;
//
//    @Column
//    private String attendanceDate;
//
//    @Column(length = 500, nullable = false)
//    private String attendanceTimeEnd;
//
//    @Column(length = 500, nullable = false)
//    private String attendanceTimeStart;
//
//    @Column(length = 500, nullable = false)
//    private String attendanceTimeHours;
//
//    @Column(length = 500, nullable = false)
//    private Double attendanceAddressLatitude;
//
//    @Column(length = 500, nullable = false)
//    private Double attendanceAddressHardness;
//
//    @Builder
//    public Attendance(Long userNoId, String attendanceOX, String attendanceDate, String attendanceTimeEnd, String attendanceTimeStart,
//                      String attendanceTimeHours, Double attendanceAddressLatitude, Double attendanceAddressHardness){
//        this.userNoId = userNoId;
//        this.attendanceOX = attendanceOX;
//        this.attendanceDate = attendanceDate;
//        this.attendanceTimeEnd = attendanceTimeEnd;
//        this.attendanceTimeStart = attendanceTimeStart;
//        this.attendanceTimeHours = attendanceTimeHours;
//        this.attendanceAddressLatitude = attendanceAddressLatitude;
//        this.attendanceAddressHardness = attendanceAddressHardness;
//    }
//
//    public void update(Long userNoId,String attendanceOX,String attendanceDate,String attendanceTimeEnd,String attendanceTimeStart,
//                       String attendanceTimeHours,Double attendanceAddressLatitude,Double attendanceAddressHardness){
//        this.userNoId = userNoId;
//        this.attendanceOX = attendanceOX;
//        this.attendanceDate = attendanceDate;
//        this.attendanceTimeEnd = attendanceTimeEnd;
//        this.attendanceTimeStart = attendanceTimeStart;
//        this.attendanceTimeHours = attendanceTimeHours;
//        this.attendanceAddressLatitude = attendanceAddressLatitude;
//        this.attendanceAddressHardness = attendanceAddressHardness;
//
//    }
//}
