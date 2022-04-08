package com.example.javamariadb.web;

import com.example.javamariadb.TestRe;
import com.example.javamariadb.TestVO;
import com.example.javamariadb.laptopdoor.LaptopDoor;
import com.example.javamariadb.laptopdoor.LaptopDoorRepository;
import com.example.javamariadb.service.laptopdoor.LaptopDoorService;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorListResponseDto;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorResponseDto;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LaptopDoorController {

    private LaptopDoorService laptopdoorService;//final

    private LaptopDoorRepository laptopDoorRepository;


    LaptopDoorController(LaptopDoorRepository userRepository) {
        this.laptopDoorRepository = userRepository;
    }

    public LaptopDoor createLaptopDoor(LaptopDoor laptopDoor) {
//        if (user.getUsername().isEmpty()) {
//            return null;
//        }
        return laptopDoorRepository.save(laptopDoor);
    }

    @PostMapping("/laptopdoor")
    public Long save(@RequestBody LaptopDoorSaveRequestDto requestDto) {
//        if (user.getUsername().isEmpty()) {
//            return null;
//        }
        return laptopdoorService.save(requestDto);
    }

    public LaptopDoor findUser(Long laptopDoorId) {
        return laptopDoorRepository.findByUserId(laptopDoorId);
    }

    public List<LaptopDoor> findAllList() {
        return laptopDoorRepository.findAllDesc();

    }
}