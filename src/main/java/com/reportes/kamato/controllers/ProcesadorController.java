package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Procesador;
import com.reportes.kamato.services.ProcesadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/procesadores")
public class ProcesadorController {

    @Autowired
    ProcesadorService procesadorService;

    @GetMapping
    public List<Procesador> listar(){
        return procesadorService.getAll();
    }

    @PostMapping
    public Procesador guardar(Procesador procesador){
        return procesadorService.save(procesador);
    }
}
