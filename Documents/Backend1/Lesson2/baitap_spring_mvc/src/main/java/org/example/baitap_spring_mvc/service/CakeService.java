package org.example.baitap_spring_mvc.service;

import org.example.baitap_spring_mvc.modell.Cake;
import org.example.baitap_spring_mvc.ripostory.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    public CakeRepository cakeRepository;

    public List<Cake> getCakeList () {
        return cakeRepository.getCakeList ( );
    }

    public void createCake ( Cake cake ) {
        cakeRepository.createCake ( cake );
    }
}