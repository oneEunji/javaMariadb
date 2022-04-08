//package com.example.javamariadb.attendance;
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
//
//    @Query("SELECT c FROM Attendance c ORDER BY c.attendanceId DESC")
//    List<Attendance> findAllDesc();
//
//    Attendance findByAttendanceId(Long attendanceId);
//
//    Attendance save(Attendance attendance);
//
//    Attendance createAttendance(Attendance attendance);
//}