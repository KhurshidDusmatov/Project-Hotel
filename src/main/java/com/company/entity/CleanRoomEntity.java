package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clean_room")
public class CleanRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity entity;
    @OneToOne
    @JoinColumn(name = "room_id")
    private  RoomEntity roomEntity;
    @Column(name = "when")
    private LocalDateTime when;
}
