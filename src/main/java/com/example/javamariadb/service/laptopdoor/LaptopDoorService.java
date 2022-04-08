package com.example.javamariadb.service.laptopdoor;
import com.example.javamariadb.laptopdoor.LaptopDoor;
import com.example.javamariadb.laptopdoor.LaptopDoorRepository;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorListResponseDto;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorResponseDto;
import com.example.javamariadb.web.dto.laptopdoor.LaptopDoorSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LaptopDoorService {
    private final LaptopDoorRepository laptopDoorRepository;

    @Transactional
    public Long save(LaptopDoorSaveRequestDto requestDto) {
        return laptopDoorRepository.save(requestDto.toEntity()).getLaptopDoorId();
    }

    @Transactional
    public void delete (Long laptopDoorId) {
        LaptopDoor laptopDoor = laptopDoorRepository.findById(laptopDoorId)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + laptopDoorId));

        laptopDoorRepository.delete(laptopDoor);
    }

    @Transactional(readOnly = true)
    public LaptopDoorResponseDto findById(Long laptopDoorId) {
        LaptopDoor entity = laptopDoorRepository.findById(laptopDoorId)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + laptopDoorId));

        return new LaptopDoorResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<LaptopDoorListResponseDto> findAllDesc() {
        return laptopDoorRepository.findAllDesc().stream()
                .map(LaptopDoorListResponseDto::new)
                .collect(Collectors.toList());
    }
}
