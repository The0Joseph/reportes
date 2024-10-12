package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Computadora;
import com.reportes.kamato.services.CompuradoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/computadora")
public class ComputadoraController {

    @Autowired
    CompuradoraService compuradoraService;

    @GetMapping
    public List<Computadora> listar(){
        return compuradoraService.getAll();
    }
}
