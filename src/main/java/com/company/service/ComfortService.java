package com.company.service;

import com.company.entity.ComfortEntity;
import com.company.repository.ComfortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComfortService {
    @Autowired
    private ComfortRepository comfortRepository;

    public void addComfort(ComfortEntity entity){
        comfortRepository.save(entity);
    }
}
