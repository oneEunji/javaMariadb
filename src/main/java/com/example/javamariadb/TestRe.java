package com.example.javamariadb;

import lombok.Builder;

import java.util.List;
public interface TestRe {
    TestVO findByUsername(String username);

    TestVO save(TestVO user);

    public List<TestVO> findAll();
}
