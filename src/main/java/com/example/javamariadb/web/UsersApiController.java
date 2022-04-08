//package com.example.javamariadb.web;
//
//import com.example.javamariadb.laptopdoor.LaptopDoor;
//import com.example.javamariadb.service.user.UserService;
//import com.example.javamariadb.user.Users;
//import com.example.javamariadb.user.UsersRepository;
//import com.example.javamariadb.web.dto.user.UsersListResponseDto;
//import com.example.javamariadb.web.dto.user.UsersResponseDto;
//import com.example.javamariadb.web.dto.user.UsersSaveRequestDto;
//import com.example.javamariadb.web.dto.user.UsersUpdateRequestDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//public class UsersApiController {
//
//    private final UserService userService;
//    private UsersRepository usersRepository;
//
//    @PostMapping("/users")
//    public Long save(@RequestBody UsersSaveRequestDto requestDto) {
//        return userService.save(requestDto);
//    }
//
//    public Users createUsers(Users users) {
////        if (users.getSsaId().isEmpty()) {
////            return null;
////        }
//        return usersRepository.createUsers(users);
//    }
////    public String createUsers(String ssaId) {
//////        if (user.getUsername().isEmpty()) {
//////            return null;
//////        }
////        return usersRepository.createUsers(ssaId);
////    }
//
//
//    @PostMapping("/users/login")
//    public UsersResponseDto login(@PathVariable Long userNoId) {
//        return userService.login(userNoId);
//    }
//
////    @PutMapping("/users/logout")
////    public Long logout(@PathVariable Long userNoId, @RequestBody UsersResponseDto responseDto) {
////        return userService.logout(userNoId, responseDto);
////    }
//
//
//    @PutMapping("/users/{userNoId}")
//    public Long update(@PathVariable Long userNoId, @RequestBody UsersUpdateRequestDto requestDto) {
//        return userService.update(userNoId, requestDto);
//    }
//
//    @DeleteMapping("/users/{userNoId}")
//    public Long delete(@PathVariable Long userNoId) {
//        userService.delete(userNoId);
//        return userNoId;
//    }
//
//    @GetMapping("/users/{userNoId}")
//    public UsersResponseDto findById(@PathVariable Long userNoId) {
//        return userService.findById(userNoId);
//    }
//
//    @PostMapping("/users/id")
//    public UsersResponseDto findByIdWithPassword(@PathVariable Long userNoId) {
//        return userService.findById(userNoId);
//    }//
//
//    @PostMapping("/users/password")
//    public UsersResponseDto findByPassword(@PathVariable Long userNoId) {
//        return userService.findById(userNoId);
//    }//
//
//    @GetMapping("/users/list")
//    public List<UsersListResponseDto> findAll() {
//        return userService.findAllDesc();
//    }
//
//}
//// Post 	 /users 	 회원 가입 	save	Users
////         Post 	 /users/login 	 로그인 	login	Users
////         Put 	 /users/logout 	 로그아웃 	logout	Users
////         Delete 	 /users/{userNoId} 	 회원 탈퇴 	delete	Users
////         Put 	 /users/{userNoId} 	 회원 정보 수정 	update	Users
////         Post 	 /users/id 	 아이디 찾기  	findByIdWithPassword	Users
////         Post 	 /users/password 	 비밀번호 찾기 	findByPassword	Users
////         Get 	 /users/{userNoId} 	 회원 정보 조회 	findById	Users
////         Get 	 /users/list 	 전체 회원 조회 	findAll	Users
//
//
//
////         Post 	 /attendance/{userNoId} 	 출근 등록 	logout	attendance
////         Post 	 /attendance/{userNoId} 	 퇴근 등록 	logout	attendance
////         Get 	 /attendance/list 	 출 퇴근 목록 조회 	logout	attendance
////         Post 	 /laptopdoor 	 사물함 개폐 등록 	save	laptopDoor
////         Get	 /laptopdoor/{userNoId} 	 사물함 개폐 검색 목록 	findById	laptopDoor
////         Get 	 /laptopdoor/list 	 사물함 개폐 조회 	findAll	laptopDoor
////         Post 	 /posts 	 게시판 등록 	save	posts
////         Get 	 /posts/list 	 게시판 조회 	findAll	posts
////         Put 	 /posts/{id} 	 게시판 수정 	update	posts
////         Delete 	 /posts/{id} 	 게시판 삭제 	delete	posts
////         Get	 /posts/{id}	 게시판 회원별 조회 	findById	posts
