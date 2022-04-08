//package com.example.javamariadb.web;
//
//import com.example.javamariadb.TestRe;
//import com.example.javamariadb.TestVO;
//import org.assertj.core.api.Assertions;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.junit.runner.RunWith;
//import org.springframework.http.MediaType;
//import org.springframework.restdocs.JUnitRestDocumentation;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.mockito.Mockito.*;
//
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@AutoConfigureRestDocs
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ExtendWith(MockitoExtension.class)
//public class TestControllerTest {
//
//    @Mock
//    TestRe userRepository;
//    @InjectMocks
//    TestController userService;
//
//    @Rule
//    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    WebApplicationContext context;
//
//
//    @Before
//    public void setUp() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
//                .apply(documentationConfiguration(this.restDocumentation))
//                .build();
//    }
//
//
////    @Test
////    public void Hello_테스트() throws Exception {
////
////        // given
////        String username = "김은지";
////
////        // when
////        mockMvc.perform(get("/hello/" + username)
////                        .characterEncoding("utf-8")
////                        .accept(MediaType.APPLICATION_JSON))
////                .andExpect(status().isOk())  // then
////                .andExpect(jsonPath("$.username").value(username))
////                .andDo(document("hello"));
////    }
//
//    @Test
//    public void saveNewUser() throws Exception {
//        // given
//        String username = "김은지";
//        String email = "dhodlfjfRKsk@naver.com";
//        TestVO user = TestVO.builder().idx(1)
//                .username("lattechiffon")
//                .email("lattechiffon@gmail.com")
////                .roles(Arrays.asList("USER", "ADMIN"))
//                .build();
//
//        when(userRepository.save(any())).thenReturn(user); // Mock 객체 주입
//        // when
//        mockMvc.perform(get("/hello/" + username)
//                        .characterEncoding("utf-8")
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())  // then
//                .andExpect(jsonPath("$.username").value(username))
//                .andDo(document("hello"));
//
//        TestVO result = userService.createUser(TestVO.builder().username("lattechiffon").build());
//        // then
//        verify(userRepository, times(1)).save(any());
//        assertThat(result, equalTo(user));
//
//        List<TestVO> all = userRepository.findAll();
////            Assertions.assertThat(all.get(0).getIdx()).isEqualTo(1L);
//            Assertions.assertThat(all.get(0).getUsername()).isEqualTo(username);
//            Assertions.assertThat(all.get(0).getEmail()).isEqualTo(email);
////        Assertions.assertThat(all.get(0).getUsername()).isEqualTo(username);
////        Assertions.assertThat(all.get(0).getEmail()).isEqualTo(email);
//    }
//
//
//
//
////    @Test
////    public void updateUser() {
////
////        // given
////        TestVO saveduser = TestVO.builder().idx(1)
////                .username("lattechiffon")
////                .email("lattechiffon@gmail.com")
////                .roles(Arrays.asList("USER", "ADMIN")).build();
////
//////        Long updateId = saveduser.getIdx();
////        String expectedUsername = "username";
////        String expectedEmail = "email";
////        List<String> roles = Arrays.asList("USER", "ADMIN");
////
////        when(userRepository.save(any())).thenReturn(saveduser); // Mock 객체 주입
////        // when
////        Long result = userService.update(1L, TestVO.builder().username("lattechiffon").build());
//////        Long result = userService.update(updateId, TestVO.builder().username("lattechiffon").build());
//////        TestVO result = userService.update(saveduser.getIdx(), TestVO.builder().username("lattechiffon").build());
////
////
////
////        TestVO user = TestVO.builder().idx(1)
////                .username(expectedUsername)
////                .email(expectedEmail)
////                .roles(roles).build();
////
////
////        // then
////        verify(userRepository, times(1)).save(any());
////        assertThat(result, equalTo(1L));
////
////    }
//}