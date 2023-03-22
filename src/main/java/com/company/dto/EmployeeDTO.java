package com.company.dto;

import com.company.enums.EmployeeStatus;
import com.company.enums.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private String name;
    private String surName;
    private String phoneNumber;
    private LocalDate birthDate;
    private EmployeeStatus status;
    private EmployeeType type;

}
