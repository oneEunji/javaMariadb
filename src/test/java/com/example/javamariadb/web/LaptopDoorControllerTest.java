package com.example.javamariadb.web;

import com.example.javamariadb.laptopdoor.LaptopDoor;
import com.example.javamariadb.laptopdoor.LaptopDoorRepository;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorSaveRequestDto;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.sql.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@SpringBootTest
@ExtendWith(SpringExtension.class)
//@ExtendWith(MockitoExtension.class)
class LaptopDoorControllerTest {

    @LocalServerPort
    private int port;

//    @Autowired
//    private TestRestTemplate restTemplate;

    @Autowired
    private LaptopDoorRepository laptopdoorRepository;

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @BeforeEach
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)

                .build();
    }

    @AfterEach
    public void tearDown() throws Exception {
        laptopdoorRepository.deleteAll();
    }

    @Test
    public void LaptopDoor_등록된다() throws Exception {
        //given

        int doorOpen = 0;
        Date doorOpenTime = new Date(20220303);
        Long userNoId = 1L;
        String ssaId = "ssaId";





        LaptopDoorSaveRequestDto requestDto = LaptopDoorSaveRequestDto.builder()
                .userNoId(userNoId)
                .ssaId(ssaId)
                .doorOpenTime(doorOpenTime)
                .doorOpen(doorOpen)
                .build();

        String url = "http://localhost:" + port + "/laptopdoor";

        //when
        mvc.perform(post(url)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(new ObjectMapper().writeValueAsString(requestDto)))
                .andExpect(status().isOk());
        System.out.println(3);
        //then
        List<LaptopDoor> all = laptopdoorRepository.findAll();
        Assertions.assertThat(all.get(0).getUserNoId()).isEqualTo(userNoId);
        Assertions.assertThat(all.get(0).getSsaId()).isEqualTo(ssaId);
        Assertions.assertThat(all.get(0).getDoorOpenTime()).isEqualTo(doorOpenTime);
        Assertions.assertThat(all.get(0).getDoorOpen()).isEqualTo(doorOpen);


    }

}
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private WebApplicationContext context;
//
//    private MockMvc mvc;
//
//    @Mock
//    LaptopDoorRepository laptopDoorRepository;
//    @InjectMocks
//    LaptopDoorController laptopDoorController;
//
//    @BeforeEach
//    public void setup() {
//        mvc = MockMvcBuilders
//                .webAppContextSetup(context)
////                .apply(springSecurity())
//                .build();
//    }
//
//    @AfterEach
//    public void tearDown() throws Exception {
//        laptopDoorRepository.deleteAll();
//    }
//
//    @Test
//    public void saveNewOpen() {
//        // given
//        int doorOpen = 0;
//        Date doorOpenTime = new Date(20220303);
//        Long userNoId = 1L;
//        String ssaId = "ssaId";
//
//        LaptopDoor laptopDoor = LaptopDoor.builder()
//                .userNoId(1L)
//                .ssaId("ssaId")
//                .doorOpenTime(new Date(20220303))
//                .doorOpen(1).build();
//
//        LaptopDoorSaveRequestDto requestDto = LaptopDoorSaveRequestDto.builder()
//                .userNoId(userNoId)
//                .ssaId(ssaId)
//                .doorOpenTime(doorOpenTime)
//                .doorOpen(doorOpen)
//                .build();
//       String url = "http://localhost:" + port + "/laptopdoor";
//
//        when(laptopDoorRepository.save(any())).thenReturn(laptopDoor); // Mock 객체 주입
//
//        // when
////        try {
////            mvc.perform(post(url)
////                            .characterEncoding("utf-8")
////                            .accept(MediaType.APPLICATION_JSON))
////                            .andExpect(status().isOk())
////                            .andExpect(jsonPath("$.userNoId").value(userNoId))
//////                            .andExpect(jsonPath("$.ssaId").value(ssaId))
//////                            .andExpect(jsonPath("$.doorOpenTime").value(doorOpenTime))
//////                            .andExpect(jsonPath("$.doorOpen").value(doorOpen))
////                            .andDo(document("hello"));
////
//////            .content(new ObjectMapper().writeValueAsString(requestDto)))
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//
//        LaptopDoor result = laptopDoorController.createLaptopDoor(LaptopDoor.builder().userNoId(1L).build());
//        // then
//
//        verify(laptopDoorRepository, times(1)).save(any());
//        assertThat(result, equalTo(laptopDoor));
////        List<LaptopDoor> all = laptopDoorRepository.findAll();
////        Assertions.assertThat(all.get(0).getUserNoId()).isEqualTo(userNoId);
////        Assertions.assertThat(all.get(0).getSsaId()).isEqualTo(ssaId);
////        Assertions.assertThat(all.get(0).getDoorOpenTime()).isEqualTo(doorOpenTime);
////        Assertions.assertThat(all.get(0).getDoorOpen()).isEqualTo(doorOpen);
//    }
