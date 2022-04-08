package com.example.javamariadb.web;

import com.example.javamariadb.TestRe;
import com.example.javamariadb.TestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestController {

    TestRe userRepository;

    TestController(TestRe userRepository) {
        this.userRepository = userRepository;
    }

    public TestVO createUser(TestVO user) {
        if (user.getUsername().isEmpty()) {
            return null;
        }
        return userRepository.save(user);
    }
    public TestVO findUser(String username) {
        return userRepository.findByUsername(username);
    }

    public List<TestVO> findAllUsers() {
        return userRepository.findAll();

    }

    public Long update(Long idx, TestVO user) {
        return idx;
    }

    @GetMapping("/hello/{username}")
    public ResponseEntity<TestVO> hello(@PathVariable String username) {
        return ResponseEntity.ok()
                .body(new TestVO(username, "안녕하세요!"));
    }
}