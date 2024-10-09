package com.reportes.kamato.services;

import com.reportes.kamato.models.Area;
import com.reportes.kamato.repositories.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    AreaRepository tipoEquipoRepository;

    public List<Area> getAll(){
        return (List<Area>) tipoEquipoRepository.findAll();
    }

    public Area save(Area area){
        return tipoEquipoRepository.save(area);
    }
}
