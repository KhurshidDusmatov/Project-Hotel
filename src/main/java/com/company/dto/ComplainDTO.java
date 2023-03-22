package com.company.dto;


import com.company.enums.ComplainStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplainDTO {
    private Integer id;
    private Integer personId;
    private ComplainStatus status;
}
