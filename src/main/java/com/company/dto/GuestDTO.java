package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestDTO {
    private Integer id;
    private String name;
    private String surName;
    private String phoneNumber;
    private Integer passportId;
}
