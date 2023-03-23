package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comfort")
public class ComfortEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "swimming_pool")
    private Boolean swimmingPool;
    @Column(name = "sauna")
    private Boolean sauna;
    @Column(name = "karaoke")
    private Boolean karaoke;
    @Column(name = "mini_bar")
    private Boolean miniBar;
    @Column(name = "tv")
    private Boolean tv;
    @Column(name = "air_conditioner")
    private Boolean airConditioner;
}
