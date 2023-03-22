package com.company.dto.entity;

import com.company.enums.EmployeeStatus;
import com.company.enums.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surName;
    @Column(name = "phone_numer", nullable = false)
    private String phoneNumber;
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
    @Column(name = "employee_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    @Column(name = "employee_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeeType type;

}
