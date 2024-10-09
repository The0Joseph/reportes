package com.reportes.kamato.controllers;

import com.reportes.kamato.models.TipoEquipo;
import com.reportes.kamato.services.TipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/categorias")
public class TipoEquipoController {

    @Autowired
    TipoEquipoService categoriaService;

    @GetMapping
    public List<TipoEquipo> listar(){
        return categoriaService.getAll();
    }

    /*RequestBody - Transforma la peticion del cliente a un objecto de tipo java*/
    @PostMapping
    public TipoEquipo guardar(@RequestBody TipoEquipo categoria){
        return categoriaService.save(categoria);
    }

}
