//package com.example.javamariadb.user;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface UsersRepository extends JpaRepository<Users, Long> {
//
//    @Query("SELECT u FROM Users u ORDER BY u.userNoId DESC")
//    List<Users> findAllDesc();
//
//    //    Users findByUsersId(Long usersId);
//
//    Users save(Users users);
//
////    String createUsers(String ssaId);
//    Users createUsers(Users users);
//}
