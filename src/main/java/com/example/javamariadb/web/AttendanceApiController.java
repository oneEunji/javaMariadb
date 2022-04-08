//package com.example.javamariadb.web;
//
//import com.example.javamariadb.TestRe;
//import com.example.javamariadb.TestVO;
//import com.example.javamariadb.attendance.Attendance;
//import com.example.javamariadb.attendance.AttendanceRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//public class AttendanceApiController {
//
//    AttendanceRepository userRepository;
//
//    AttendanceApiController(AttendanceRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public Attendance createAttendance(Attendance user) {
////        if (user.getUserNoId().intValue(0L)) {
////            return null;
////        }
//        return userRepository.save(user);
//    }
//    public Attendance findAttendance(Long attendanceId) {
//        return userRepository.findByAttendanceId(attendanceId);
//    }
//    public List<Attendance> findAllDesc() {
//        return userRepository.findAll();
//
//    }
//}