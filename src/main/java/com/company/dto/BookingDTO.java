package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingDTO {
    private Integer id;
    private Integer guestId;
    private Integer roomId;
    private LocalDate startDate;
    private Integer durationDay;
    private Double summa;
}
