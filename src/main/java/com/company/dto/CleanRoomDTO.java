package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CleanRoomDTO {
    private Integer id;
    private Integer employeeId;
    private Integer roomId;
    private LocalDateTime when;
}
