package com.reportes.kamato.controllers;

import com.reportes.kamato.models.ComponenteEquipo;
import com.reportes.kamato.services.ComponenteEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/componentes")

public class ComponenteEquipoController {

    @Autowired
    ComponenteEquipoService componenteEquipoService;

    @GetMapping
    public List<ComponenteEquipo> listar(){
        return  componenteEquipoService.getAll();
    }
}
