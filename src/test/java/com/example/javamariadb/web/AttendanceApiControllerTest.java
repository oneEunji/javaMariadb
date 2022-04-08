//package com.example.javamariadb.web;
//import com.example.javamariadb.attendance.Attendance;
//import com.example.javamariadb.attendance.AttendanceRepository;
//import com.example.javamariadb.company.Company;
//import com.example.javamariadb.company.CompanyRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//
//@ExtendWith(MockitoExtension.class)
//public class AttendanceApiControllerTest {
//
//    @Mock
//    AttendanceRepository attendanceRepository;
//    @InjectMocks
//    AttendanceApiController attendanceApiController;
//
//    @Test
//    public void saveNewAttendance() {
//        // given
//            Long attendanceId = 1L;
//            Long userNoId = 1L;
//            String attendanceOX = "attendanceOX";
//            String ssaId = "ssaId";
//            Long companyId = 1L ;
//            String attendanceDate = "attendanceDate";
//            String attendanceTimeEnd = "attendanceTimeEnd";
//            String attendanceTimeStart = "attendanceTimeStart";
//            String attendanceTimeHours = "attendanceTimeHours";
//            Double attendanceAddressLatitude = 1.1;
//            Double attendanceAddressHardness = 2.2;
//
//        Attendance attendance = Attendance.builder()
//                .userNoId(userNoId)
//                .attendanceOX(attendanceOX)
//                .attendanceDate(attendanceDate)
//                .attendanceTimeEnd(attendanceTimeEnd)
//                .attendanceTimeStart(attendanceTimeStart)
//                .attendanceTimeHours(attendanceTimeHours)
//                .attendanceAddressLatitude(attendanceAddressLatitude)
//                .attendanceAddressHardness(attendanceAddressHardness)
//                .build();
//
//        when(attendanceRepository.save(any())).thenReturn(attendance); // Mock 객체 주입
//
//        // when
//        Attendance result
//                = attendanceApiController.createAttendance(attendance);
//        // then
//        verify(attendanceRepository, times(1)).save(any());
//        assertThat(result, equalTo(attendance));
//    }
//
//}
//
