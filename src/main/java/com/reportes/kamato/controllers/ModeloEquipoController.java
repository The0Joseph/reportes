package com.reportes.kamato.controllers;

import com.reportes.kamato.models.MarcaEquipo;
import com.reportes.kamato.models.ModeloEquipo;
import com.reportes.kamato.services.ModeloEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/modelo-equipos")
public class ModeloEquipoController {

    @Autowired
    ModeloEquipoService modeloEquipoService;

    @GetMapping
    public List<ModeloEquipo> listar(){
        return modeloEquipoService.getAll();
    }

    @PostMapping
    public ModeloEquipo guardar(@RequestBody ModeloEquipo modeloEquipo){
        return modeloEquipoService.save(modeloEquipo);
    }
}
