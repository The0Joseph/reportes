package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Programa;
import com.reportes.kamato.services.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/programas")

public class ProgramaController {

    @Autowired
    ProgramaService programaService;

    @GetMapping
    public List<Programa> listar(){
        return programaService.getAll();
    }

    @PostMapping
    public Programa guardar(@RequestBody Programa programa){
        return programaService.save(programa);
    }
}
