package com.company.mapper;

import com.company.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomComfortMapper {
    private Integer roomId;
    private Integer roomNumber;
    private Integer roomFloorNumber;
    private RoomType roomType;
    private Double roomPrice;
    private Integer roomArea;
    private Boolean swimmingPool;
    private Boolean sauna;
    private Boolean karaoke;
    private Boolean miniBar;
    private Boolean tv;
    private Boolean airConditioner;

}
