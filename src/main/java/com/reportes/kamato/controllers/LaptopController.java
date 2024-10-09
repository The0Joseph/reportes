package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Laptop;
import com.reportes.kamato.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/laptops")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @GetMapping
    public List<Laptop> listar(){
        return laptopService.getAll();
    }
}
