//package com.example.javamariadb.web.dto.attendance;
//
//import com.example.javamariadb.attendance.Attendance;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@NoArgsConstructor
//public class AttendanceSaveRequestDto {
//
//    private Long userNoId;
//    private Long deptId;
//    private Long companyBranchId;
//    private Long companyId;
//    private String attendanceOX;
//    private String attendanceDate;
//    private String attendanceTimeEnd;
//    private String attendanceTimeStart;
//    private String attendanceTimeHours;
//    private Double attendanceAddressLatitude;
//    private Double attendanceAddressHardness;
//
//
//    @Builder
//    public AttendanceSaveRequestDto(Long userNoId, Long deptId, Long companyBranchId, Long companyId,
//                                    String attendanceOX, String attendanceDate, String attendanceTimeEnd, String attendanceTimeStart,
//                                    String attendanceTimeHours, Double attendanceAddressLatitude, Double attendanceAddressHardness) {
//        this.userNoId =  userNoId;
//        this.deptId =  deptId;
//        this.companyBranchId = companyBranchId;
//        this.companyId = companyId;
//        this.attendanceOX = attendanceOX;
//        this.attendanceDate =  attendanceDate;
//        this.attendanceTimeEnd =  attendanceTimeEnd;
//        this.attendanceTimeStart = attendanceTimeStart;
//        this.attendanceTimeHours = attendanceTimeHours;
//        this.attendanceAddressLatitude = attendanceAddressLatitude;
//        this.attendanceAddressHardness = attendanceAddressHardness;
//
//    }
//
//    public Attendance toEntity() {
//        return Attendance.builder()
//                .userNoId(userNoId)
//                .attendanceOX(attendanceOX)
//                .attendanceDate(attendanceDate)
//                .attendanceTimeEnd(attendanceTimeEnd)
//                .attendanceTimeStart(attendanceTimeStart)
//                .attendanceTimeHours(attendanceTimeHours)
//                .attendanceAddressLatitude(attendanceAddressLatitude)
//                .attendanceAddressHardness(attendanceAddressHardness)
//                .build();
//    }
//
//}
