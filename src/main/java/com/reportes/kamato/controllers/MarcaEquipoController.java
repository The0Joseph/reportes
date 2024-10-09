package com.reportes.kamato.controllers;

import com.reportes.kamato.models.MarcaEquipo;
import com.reportes.kamato.services.MarcaEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/marca-equipos")
public class MarcaEquipoController {

    @Autowired
    MarcaEquipoService marcaEquipoService;

    @GetMapping
    public List<MarcaEquipo> listar(){
        return marcaEquipoService.getAll();
    }

    @PostMapping
    public MarcaEquipo guardar(@RequestBody MarcaEquipo marcaEquipo){
        return marcaEquipoService.save(marcaEquipo);
    }

}
