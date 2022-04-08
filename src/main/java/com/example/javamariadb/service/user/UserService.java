//package com.example.javamariadb.service.user;
//
//import com.example.javamariadb.user.Users;
//import com.example.javamariadb.user.UsersRepository;
//import com.example.javamariadb.web.dto.user.UsersListResponseDto;
//import com.example.javamariadb.web.dto.user.UsersResponseDto;
//import com.example.javamariadb.web.dto.user.UsersSaveRequestDto;
//import com.example.javamariadb.web.dto.user.UsersUpdateRequestDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RequiredArgsConstructor
//@Service
//public class UserService {
//
//    private final UsersRepository usersRepository;
//
//    @Transactional
//    public Long save(UsersSaveRequestDto requestDto) {
//        return usersRepository.save(requestDto.toEntity()).getUserNoId();
//    }
//
//    @Transactional
//    public Long update(Long userNoId, UsersUpdateRequestDto requestDto) {
//        Users users = usersRepository.findById(userNoId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. userNoId=" + userNoId));
//
//        users.update(requestDto.getUserName(),requestDto.getUserEmail(),requestDto.getUserPassword()
//                ,requestDto.getSsaId(),requestDto.getUserDept(),requestDto.getUserPosition(),requestDto.getCompanyId());
//
//        return userNoId;
//    }
//
//    @Transactional
//    public void delete (Long userNoId) {
//        Users users = usersRepository.findById(userNoId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. userNoId=" + userNoId));
//
//        usersRepository.delete(users);
//    }
//
//    @Transactional(readOnly = true)
//    public UsersResponseDto findById(Long userNoId) {
//        Users entity = usersRepository.findById(userNoId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. userNoId=" + userNoId));
//
//        return new UsersResponseDto(entity);
//    }
//
//    @Transactional(readOnly = true)
//    public List<UsersListResponseDto> findAllDesc() {
//        return usersRepository.findAllDesc().stream()
//                .map(UsersListResponseDto::new)
//                .collect(Collectors.toList());
//    }
//
//    public UsersResponseDto login(Long userNoId) {
//        Users entity = usersRepository.findById(userNoId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. userNoId=" + userNoId));
//
//        return new UsersResponseDto(entity);
//    }
//
//
//}
