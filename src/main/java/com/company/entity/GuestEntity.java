package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "guest")
public class GuestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surName;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passport_id")
    private PassportEntity entity;
}
