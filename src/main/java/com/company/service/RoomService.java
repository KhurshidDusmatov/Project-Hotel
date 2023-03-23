package com.company.service;

import com.company.entity.RoomEntity;
import com.company.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
