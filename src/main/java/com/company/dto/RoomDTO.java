package com.company.dto;

import com.company.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {

    private Integer id;
    private Integer number;
    private Integer floorNumber;
    private RoomType type;
    private Double price;
    private Integer area;

}
