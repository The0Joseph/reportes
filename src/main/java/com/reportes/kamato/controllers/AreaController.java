package com.reportes.kamato.controllers;

import com.reportes.kamato.models.Area;
import com.reportes.kamato.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "api/v1/areas")

public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping
    public List<Area> listar(){
        return areaService.getAll();
    }

    @PostMapping
    public Area guardar(@RequestBody Area area){
        return areaService.save(area);
    }


}
