package com.reportes.kamato.services;

import com.reportes.kamato.models.Laptop;
import com.reportes.kamato.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    public List<Laptop> getAll(){
        return (List<Laptop>) laptopRepository.findAll();
    }
}
