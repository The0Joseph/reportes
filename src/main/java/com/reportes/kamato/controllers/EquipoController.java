package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Equipo;
import com.reportes.kamato.services.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/equipos")

public class EquipoController {

    @Autowired
    EquipoService equipoService;


    @GetMapping
    public List<Equipo> listar(){
        return equipoService.getAll();
    }

}
