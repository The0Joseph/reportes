package com.reportes.kamato.controllers;

import com.reportes.kamato.models.TipoEquipo;
import com.reportes.kamato.services.TipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/tipoEquipos")

@CrossOrigin(origins = "http://localhost:4200")
public class TipoEquipoController {

    @Autowired
    TipoEquipoService tipoEquipoService;

    @GetMapping
    public List<TipoEquipo> listar(){
        return tipoEquipoService.getAll();
    }

    /*RequestBody - Transforma la peticion del cliente a un objecto de tipo java*/
    @PostMapping
    public TipoEquipo guardar(@RequestBody TipoEquipo categoria){ return tipoEquipoService.save(categoria); }


    @GetMapping("/{id}")
    public TipoEquipo obtenerPorId(@PathVariable Long id) { return tipoEquipoService.getById(id); }


    @DeleteMapping("/{id}")
    public void eliminarPorId (@PathVariable Long id){ tipoEquipoService.deleteById(id); }

}
