package com.company.dto.entity;

import com.company.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "number", nullable = false)
    private Integer number;
    @Column(name = "floor_number", nullable = false)
    private Integer floorNumber;
    @Column(name = "room_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoomType type;
    @Column(name = "price", nullable = false)
    private Double price;
    @Column(name = "area", nullable = false)
    private Integer area;

}
