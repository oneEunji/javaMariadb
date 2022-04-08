package com.example.javamariadb;

import lombok.*;

import javax.persistence.*;
import java.util.List;
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class TestVO {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idx;

        @Column(length = 500, nullable = false)
        private String username;

        @Column(columnDefinition = "TEXT", nullable = false)
        private String email;

//        private List<String> roles;

        @Builder
        public TestVO(String username, String email) {

            this.username = username;
            this.email = email;
        }
}
