package com.example.javamariadb.web.dto.laptopdoor;

import com.example.javamariadb.laptopdoor.LaptopDoor;
import lombok.Getter;

import java.sql.Date;

@Getter
public class LaptopDoorListResponseDto {

    private Long laptopDoorId;
    private Long userNoId;
    private String ssaId;
    private Date doorOpenTime;
    private int doorOpen;


    public LaptopDoorListResponseDto(LaptopDoor entity) {
        this.laptopDoorId = entity.getLaptopDoorId();
        this.userNoId = entity.getUserNoId();
        this.ssaId = entity.getSsaId();
        this.doorOpenTime = entity.getDoorOpenTime();
        this.doorOpen = entity.getDoorOpen();
    }
}
