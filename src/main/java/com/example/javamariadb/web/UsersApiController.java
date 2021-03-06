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
//// Post 	 /users 	 ?????? ?????? 	save	Users
////         Post 	 /users/login 	 ????????? 	login	Users
////         Put 	 /users/logout 	 ???????????? 	logout	Users
////         Delete 	 /users/{userNoId} 	 ?????? ?????? 	delete	Users
////         Put 	 /users/{userNoId} 	 ?????? ?????? ?????? 	update	Users
////         Post 	 /users/id 	 ????????? ??????  	findByIdWithPassword	Users
////         Post 	 /users/password 	 ???????????? ?????? 	findByPassword	Users
////         Get 	 /users/{userNoId} 	 ?????? ?????? ?????? 	findById	Users
////         Get 	 /users/list 	 ?????? ?????? ?????? 	findAll	Users
//
//
//
////         Post 	 /attendance/{userNoId} 	 ?????? ?????? 	logout	attendance
////         Post 	 /attendance/{userNoId} 	 ?????? ?????? 	logout	attendance
////         Get 	 /attendance/list 	 ??? ?????? ?????? ?????? 	logout	attendance
////         Post 	 /laptopdoor 	 ????????? ?????? ?????? 	save	laptopDoor
////         Get	 /laptopdoor/{userNoId} 	 ????????? ?????? ?????? ?????? 	findById	laptopDoor
////         Get 	 /laptopdoor/list 	 ????????? ?????? ?????? 	findAll	laptopDoor
////         Post 	 /posts 	 ????????? ?????? 	save	posts
////         Get 	 /posts/list 	 ????????? ?????? 	findAll	posts
////         Put 	 /posts/{id} 	 ????????? ?????? 	update	posts
////         Delete 	 /posts/{id} 	 ????????? ?????? 	delete	posts
////         Get	 /posts/{id}	 ????????? ????????? ?????? 	findById	posts
