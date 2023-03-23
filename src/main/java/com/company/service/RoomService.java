package com.company.service;

import com.company.entity.RoomEntity;
import com.company.mapper.RoomComfortMapper;
import com.company.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public void addRoom(RoomEntity entity) {
         if (entity.getPrice()<0){
             System.out.println("Price invalid");
             return;
         }
         roomRepository.save(entity);
         System.out.println("Room successfully added");
    }

    public void getRooms() {
        List<RoomComfortMapper> rooms = roomRepository.getList();
        rooms.forEach(System.out::println);
//        roomRepository.getList();
    }

    public void deleteRoom(Integer id) {
        if (id==null || id==0){
            System.out.println("Id is invalid");
            return;
        }
        roomRepository.delete(id);
    }

    public void find(Integer id) {
        if (id==null || id==0){
            System.out.println("Id is invalid");
            return;
        }
        RoomEntity entity = roomRepository.find(id);
        System.out.println(entity);
    }
}
