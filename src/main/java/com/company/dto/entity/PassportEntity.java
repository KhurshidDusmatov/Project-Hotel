package com.company.dto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passport")
public class PassportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "given_date")
    private LocalDate givenDate;
    @Column(name = "valid_until_date")
    private LocalDate validUntilDate;
    @Column(name = "responsible_person")
    private String responsiblePerson;
    @Column(name = "given_place")
    private String givenPlace;



}
