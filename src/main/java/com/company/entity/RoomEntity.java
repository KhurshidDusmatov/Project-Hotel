package com.company.entity;

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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comfort_id")
    private ComfortEntity comfortEntity;

    public RoomEntity(Integer number, Integer floorNumber, RoomType type, Double price, Integer area, ComfortEntity comfortEntity) {
        this.number = number;
        this.floorNumber = floorNumber;
        this.type = type;
        this.price = price;
        this.area = area;
        this.comfortEntity = comfortEntity;
    }

    public RoomEntity(Integer id, Integer number, Integer floorNumber, RoomType type, Double price, Integer area) {
        this.id = id;
        this.number = number;
        this.floorNumber = floorNumber;
        this.type = type;
        this.price = price;
        this.area = area;
    }
}
