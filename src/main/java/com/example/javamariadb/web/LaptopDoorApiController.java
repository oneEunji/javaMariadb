//package com.example.javamariadb.web;
//
//import com.example.javamariadb.laptopdoor.LaptopDoor;
//import com.example.javamariadb.service.laptopdoor.LaptopDoorService;
//import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorListResponseDto;
//import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorResponseDto;
//import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorSaveRequestDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//public class LaptopDoorApiController {
//
//    private final LaptopDoorService laptopdoorService;
//
////    @PostMapping("/laptopdoor")
//    public Long save(@RequestBody LaptopDoorSaveRequestDto requestDto) {
//        return laptopdoorService.save(requestDto);
//    }
////    @GetMapping("/laptopdoor/{laptopDoorId}")
//    public LaptopDoorResponseDto findById(@PathVariable Long laptopDoorId) {
//        return laptopdoorService.findById(laptopDoorId);
//    }
//
////    @GetMapping("/laptopdoor/list")
//    public List<LaptopDoorListResponseDto> findAll() {
//        return laptopdoorService.findAllDesc();
//    }
//}
